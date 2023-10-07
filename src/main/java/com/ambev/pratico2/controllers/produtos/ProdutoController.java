package com.ambev.pratico2.controllers.produtos;

import com.ambev.pratico2.service.ProdutoService;
import com.ambev.pratico2.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/produtos")
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        Produto p = produtoService.salvarProduto(produto);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }
}
