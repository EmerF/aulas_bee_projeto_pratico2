package Repository;
import Produtos.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, String> {

    List<Produto> findByNome(String nome);

}
