package com.ambev.pratico2.rest;

import com.ambev.pratico2.exceptions.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SampleController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) throws CustomNotFoundException {
        if ("error".equals(name)) throw new CustomNotFoundException("Error");
        return "Hello, " + name + "!";
    }

    @GetMapping("/generic")
    public String generic() throws Exception {
        throw new Exception("Generic Error");
    }
}
