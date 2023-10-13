package repository;

import model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
    Optional<Funcionario> findById(String id);
    void deleteById(String id);

    // Método personalizado para salvar um Funcionario
    Funcionario save(Funcionario funcionario);
}