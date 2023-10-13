package com.ambev.pratico2.model.funcionarios;

import com.ambev.pratico2.interfaces.CalculoAjudaCusto;
import com.ambev.pratico2.interfaces.ImpostoDeRenda;

public class Gerente extends Funcionario implements CalculoAjudaCusto, ImpostoDeRenda {

    private Endereco endereco;

    protected Gerente(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario);
        this.endereco = endereco;
    }

    @Override
    public double calculoAjudaCusto() {
        return getSalario() * 0.05;
    }

    @Override
    public double impostoDeRenda() {
        return getSalario() * 0.1;
    }
}
