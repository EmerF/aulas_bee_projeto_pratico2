package com.ambev.pratico2.Services;

import com.ambev.pratico2.Repository.ProdutoRepository;
import com.ambev.pratico2.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }
}
