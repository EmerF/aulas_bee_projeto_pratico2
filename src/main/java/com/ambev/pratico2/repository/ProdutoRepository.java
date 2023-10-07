package com.ambev.pratico2.repository;

import com.ambev.pratico2.model.Cerveja;
import com.ambev.pratico2.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, Long> {
    public List<Produto> findByDescricao(String descricao);
}
