package com.ambev.pratico2.controller;

import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    public ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> createProduct(@RequestBody Produto produto) {
        if (produto.getId() == 0)
            return new ResponseEntity<Produto>(HttpStatus.BAD_REQUEST);

        Produto novoProduto = produtoService.salvarProduto(produto);
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
    }

    @GetMapping("/error")
    public ResponseEntity<String> errorProduct() {
        return new ResponseEntity<>("Produto não encontrado.", HttpStatus.NOT_FOUND);
    }
}
