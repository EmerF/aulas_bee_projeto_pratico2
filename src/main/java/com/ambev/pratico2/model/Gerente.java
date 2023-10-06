package com.ambev.pratico2.model;

public class Gerente extends Funcionarios{
    public Gerente(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }

    @Override
    public double calculoAjudaCusto(){
        return getSalario() * 0.05;
    }

    @Override
    public double impostoRenda(){
        return getSalario() * 0.10;
    }
}
