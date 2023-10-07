package com.ambev.pratico2.services;

import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }
}
