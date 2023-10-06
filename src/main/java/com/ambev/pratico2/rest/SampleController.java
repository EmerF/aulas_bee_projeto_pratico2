package com.ambev.pratico2.rest;

import com.ambev.pratico2.exceptions.CustomNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/api/nome/{nome}")
    public String nome(@PathVariable String nome){
        if("erro".equals(nome)){
            throw new CustomNotFoundException("erro no servico");
        }
        return "nome, " + nome + "!";
    }

    @GetMapping("/api/generic")
    public String generic() throws Exception{
        throw new Exception("Generic Error");
    }
}
