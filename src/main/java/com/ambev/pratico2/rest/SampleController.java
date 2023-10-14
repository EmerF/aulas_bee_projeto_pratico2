package com.ambev.pratico2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambev.pratico2.exceptions.BadRequest;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/nome/{nome}")
    public String nomeEndepoint(@PathVariable String nome) {
        if ("erro".equals(nome)) {
            throw new BadRequest("erro no serviço");
        }
        return "Olá, " + nome + "!";
    }

    @GetMapping("/generic")
    public String generic() {
        // Simulate an internal server error with a different exception class
        throw new RuntimeException("Generic Error");
    }
}
