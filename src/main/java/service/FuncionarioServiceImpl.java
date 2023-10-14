package service;
import model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FuncionarioRepository;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.findById(String.valueOf(id)).orElse(null);
    }

    @Override
    public void deletarFuncionario(Long id) {
        funcionarioRepository.deleteById(String.valueOf(id));
    }

    @Override
    public double calcularAjudaCusto(Funcionario funcionario) {
        // Implemente a lógica de cálculo da ajuda de custo
        // Exemplo: 5% sobre o salário
        return funcionario.getSalario() * 0.05;
    }

    @Override
    public double calcularImpostoRenda(Funcionario funcionario) {
        // Implemente a lógica de cálculo do imposto de renda
        // Exemplo: 10% sobre o salário
        return funcionario.getSalario() * 0.10;
    }
}

