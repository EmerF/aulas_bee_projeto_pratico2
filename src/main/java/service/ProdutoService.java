package service;

import model.Produto;

import java.util.List;

public interface ProdutoService {
    Produto salvarProduto(Produto produto);
    List<Produto> listarProdutos();
    Produto buscarProdutoPorId(Long id);
    void deletarProduto(Long id);
    double calcularAjudaCusto(Produto produto);
    double calcularImpostoRenda(Produto produto);
}

