package com.ambev.pratico2.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ambev.pratico2.model.Produto;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String>{
    List<Produto> findByNome(String cervejaTeste);
}
