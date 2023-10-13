package controllers;

import exceptions.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; // Importe a classe ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class ErroController {

    @GetMapping("/nome")
    public void erro(@RequestParam String nome) {
        if ("erro".equals(nome)) {
            throw new CustomException("erro no serviço", HttpStatus.BAD_REQUEST.value());
        }
    }

    @GetMapping("/generic")
    public void genericError() {
        throw new CustomException("Erro genérico", HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException e) {
        return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
    }
}