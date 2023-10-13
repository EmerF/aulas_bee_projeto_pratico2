package com.ambev.pratico2.model.funcionarios;

import com.ambev.pratico2.interfaces.CalculoAjudaCusto;
import com.ambev.pratico2.interfaces.ImpostoDeRenda;

public class Dev extends Funcionario implements CalculoAjudaCusto, ImpostoDeRenda {

    protected Dev(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario);
    }

    @Override
    public double calculoAjudaCusto() {
        return getSalario() * 0.1;
    }

    @Override
    public double impostoDeRenda() {
        return getSalario() * 0.05;
    }
}