package com.ambev.pratico2.Repository;

import com.ambev.pratico2.Model.TipoProduto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoProdutoRepository extends MongoRepository<TipoProduto, String> {
    List<TipoProduto> findByTipoNome(String nome);
}