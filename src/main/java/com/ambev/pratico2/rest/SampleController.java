package com.ambev.pratico2.rest;

import com.ambev.pratico2.exceptions.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SampleController {
    @GetMapping("/nome/{nome}")
    public String nomeEndpoint(@PathVariable String nome) {
        if ("erro".equals(nome)) {
            throw new CustomNotFoundException("erro no serviço");
        }
        return "Olá, " + nome + "!";
    }

    @GetMapping("/generic")
    public String genericEndpoint() {
        throw new RuntimeException(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
    }
}
