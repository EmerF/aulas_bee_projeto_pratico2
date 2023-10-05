package Service;


import Produtos.Produto;
import Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
// Outros métodos de serviço, como buscar, atualizar e excluir produtos
