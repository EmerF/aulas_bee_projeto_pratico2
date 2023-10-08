package com.ambev.pratico2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ErroController extends RuntimeException {

    @GetMapping("/nome")
    public ResponseEntity<String> getNome(@RequestParam String nome) {
        if ("erro".equalsIgnoreCase(nome)) {
            throw new CustomException("erro no serviço");
        }
        return ResponseEntity.ok("Nome válido: " + nome);
    }

    @GetMapping("/generic")
    public ResponseEntity<String> genericError() {
        throw new RuntimeException("Erro genérico");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}

