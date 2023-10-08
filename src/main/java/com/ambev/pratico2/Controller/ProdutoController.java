package com.ambev.pratico2.Controller;

import com.ambev.pratico2.Model.Produto;
import com.ambev.pratico2.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public void salvarProduto(@RequestBody Produto produto) {
        produtoService.salvarProduto(produto);
    }
}

