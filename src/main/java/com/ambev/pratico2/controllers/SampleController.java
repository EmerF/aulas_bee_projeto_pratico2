package com.ambev.pratico2.controllers;

import com.ambev.pratico2.exception.CustomNotFoundException;
import org.springframework.web.bind.annotation.*;


//curl -i http://localhost:8080/api/hello/error
//curl -i -X GET http://localhost:8080/api/generic

@RequestMapping("/api")
public class SampleController {

    @GetMapping("/nome/{nome}")
    public String nome(@PathVariable String nome) throws CustomNotFoundException {
        if ("erro".equals(nome)) {
            throw new CustomNotFoundException("erro no serviço");
        }
        return "Nome:, " + nome;
    }

    @GetMapping("/generic")
    public String generic() throws Exception {
        throw new Exception("Erro genérico");
    }
}