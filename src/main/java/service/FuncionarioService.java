package service;

import model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    Funcionario salvarFuncionario(Funcionario funcionario);
    List<Funcionario> listarFuncionarios();
    Funcionario buscarFuncionarioPorId(Long id);
    void deletarFuncionario(Long id);

    double calcularAjudaCusto(Funcionario funcionario);

    double calcularImpostoRenda(Funcionario funcionario);
}
