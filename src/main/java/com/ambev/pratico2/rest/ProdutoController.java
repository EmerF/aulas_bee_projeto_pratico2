package com.ambev.pratico2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.service.ProdutoService;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
     private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        Produto produtoSalvar = produtoService.salvarProduto(produto);
        return new ResponseEntity<>(produtoSalvar, HttpStatus.CREATED);
    }
}
