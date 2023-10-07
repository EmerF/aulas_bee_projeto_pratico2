package com.ambev.pratico2.Repository;

import com.ambev.pratico2.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, Integer> {
    Optional<Produto> findByDescricao(String descricao);

}
