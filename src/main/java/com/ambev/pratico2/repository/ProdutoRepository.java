package com.ambev.pratico2.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ambev.pratico2.models.Produto;
    public interface ProdutoRepository extends MongoRepository<Produto, String> {
        List<Produto> findByDescricao(String descricao);
        List<Produto> findByPreco(Double preco);
        List<Produto> findByDescricaoAndPreco(String descricao, Double preco);

    }



