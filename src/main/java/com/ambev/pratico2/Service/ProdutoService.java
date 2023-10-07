package com.ambev.pratico2.Service;

import com.ambev.pratico2.Repository.ProdutoRepository;
import com.ambev.pratico2.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> findByDescricao(String descricao) {
        return produtoRepository.findByDescricao(descricao);
    }
}

