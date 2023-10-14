package com.ambev.pratico2.model;


import com.ambev.pratico2.interfaces.CalculoAjudaCusto;
import com.ambev.pratico2.interfaces.ImpostoRenda;

public class Gerente extends Funcionario implements CalculoAjudaCusto, ImpostoRenda {

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
    public double impostoRenda() {
        return getSalario() * 0.1;
    }
}