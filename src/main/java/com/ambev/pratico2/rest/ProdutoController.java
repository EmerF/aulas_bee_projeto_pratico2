package com.ambev.pratico2.rest;

import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.service.ProdutoService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto createProduct(@RequestBody @NotNull Produto produto) {
        if(produto.getNome().equals("erro")){

        }
        return produtoService.salvarProduto(produto);
    }
    @GetMapping("/error")
    public ResponseEntity errorProduct() {
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }
}
