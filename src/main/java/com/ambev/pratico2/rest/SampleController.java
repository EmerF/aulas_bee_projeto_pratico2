package com.ambev.pratico2.rest;

import com.ambev.pratico2.exception.exceptions.CustomNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//curl -i http://localhost:8080/api/hello/error
//curl -i -X GET http://localhost:8080/api/generic

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/nome/{nome}")
    public String hello(@PathVariable String nome) {
        if ("erro".equals(nome)) {
            throw new CustomNotFoundException("erro no serviço");
        }
        return "Hello, " + nome + "!";
    }

    @GetMapping("/generic")
    public String generic() throws Exception {
            throw new Exception("Unknown error");
    }
}
