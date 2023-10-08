package com.ambev.pratico2.controllers;


import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.repository.ProdutoRepository;
import com.ambev.pratico2.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Autowired
    private ProdutoService produtoService;

        @PostMapping
        public Produto cadastrarProduto(@RequestBody Produto produto) {
            if(produto.getNome().equals("erro")){
            }
            return produtoService.salvarProduto(produto);
        }

    @GetMapping("/erro")
    public ResponseEntity erroProduto() {
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }
}
