package com.ambev.pratico2.controllers;


import com.ambev.pratico2.exceptions.CustomBadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ExceptionController {

    @GetMapping("/nome/{nome}")
    public ResponseEntity<String> nome(@PathVariable String nome) {
        try {
            if (nome.equals("erro")) {
                throw new CustomBadRequestException("erro no serviço");
            }
            return ResponseEntity.ok("Nome válido: " + nome);

        } catch(CustomBadRequestException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/generic")
    public ResponseEntity<String> generic() {
        try {
            throw new Exception();
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
