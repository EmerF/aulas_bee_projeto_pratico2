package com.ambev.pratico2.controller.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/nome/{name}")
    public ResponseEntity<String> boasVindas(@PathVariable String name){
        if ("erro".equals(name)) {
            throw new BadRequestCustomException("erro no serviço");
        }
        return ResponseEntity.ok("Bem vindo(a) " + name);
    }

    @GetMapping("/generic")
    public String generic() throws Exception {
        throw new Exception("500(Internal Server Error)");
    }

}
