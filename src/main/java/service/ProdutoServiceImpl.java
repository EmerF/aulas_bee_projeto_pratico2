package service;

import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(String.valueOf(id)).orElse(null);
    }

    @Override
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(String.valueOf(id));
    }

    @Override
    public double calcularAjudaCusto(Produto produto) {
        // Implemente a lógica de cálculo da ajuda de custo
        // Exemplo: 5% sobre o preço
        return produto.getPreco() * 0.05;
    }

    @Override
    public double calcularImpostoRenda(Produto produto) {
        // Implemente a lógica de cálculo do imposto de renda
        // Exemplo: 10% sobre o preço
        return produto.getPreco() * 0.10;
    }
}