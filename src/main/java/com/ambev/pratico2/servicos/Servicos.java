package com.ambev.pratico2.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambev.pratico2.produtos.Produto;

@Service
public class Servicos {
    private ProdutoRepository produtoRepository;

        @Autowired
        public void ProdutoService(ProdutoRepository produtoRepository) {
            this.produtoRepository = produtoRepository;
        }
        public Produto salvarProduto(Produto produto) {
            return produtoRepository.save(produto);
        }
}

