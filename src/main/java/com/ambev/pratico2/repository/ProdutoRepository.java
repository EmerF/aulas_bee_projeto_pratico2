package com.ambev.pratico2.repository;

import com.ambev.pratico2.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}
