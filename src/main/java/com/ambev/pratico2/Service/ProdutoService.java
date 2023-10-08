package com.ambev.pratico2.Service;

import com.ambev.pratico2.Model.Produto;
import com.ambev.pratico2.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void salvarProduto(Produto produto) {
        produtoRepository.save(produto);
    }
}