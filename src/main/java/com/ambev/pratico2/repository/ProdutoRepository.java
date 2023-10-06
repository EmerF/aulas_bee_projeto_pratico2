package com.ambev.pratico2.repository;

import com.ambev.pratico2.model.Cerveja;
import com.ambev.pratico2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    public List <Cerveja> findByNome(@Param("descricao") String descricao);
}
