package com.ambev.pratico2;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Dictionary;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Dictionary<Object, Object> findByNome(String cervejaTeste);
}
