package com.ambev.pratico2.Controller;

import com.ambev.pratico2.Exceptions.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ExceptionsController {

    @GetMapping("/nome/{nome}")
    public String nomeEndpoint(@PathVariable String nome) {
        if ("erro".equals(nome)) {
            throw new CustomNotFoundException("erro no serviço");
        }
        return "Olá, " + nome + ", super legal saber que você não é um erro!";
    }

    @GetMapping("/generic")
    public String genericEndpoint() {
        throw new RuntimeException(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
    }
}
