package service;

import model.heranca.polimorfismo.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProdutoRepository;

import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }
}

