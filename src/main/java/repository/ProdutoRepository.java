package repository;

import model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Optional<Produto> findById(String id);

    void deleteById(String id);

    // Método personalizado para salvar um Produto
    Produto save(Produto produto);
}
