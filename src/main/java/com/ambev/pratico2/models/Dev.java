package com.ambev.pratico2.models;

import com.ambev.pratico2.interfaces.CalculoDeTaxa;

public class Dev extends Funcionario implements CalculoDeTaxa {
    public Dev(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }

    @Override
    public double calculoAjudaDeCusto() {
        return this.getSalario() * 0.10;
    }

    @Override
    public double calculoImpostoDeRenda() {
        return this.getSalario() * 0.05;
    }
}
