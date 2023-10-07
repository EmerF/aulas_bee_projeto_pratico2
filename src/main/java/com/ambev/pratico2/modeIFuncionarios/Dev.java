package com.ambev.pratico2.modeIFuncionarios;

public class Dev extends Funcionario {


    public Dev(String nome, int cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }

    @Override
    public double calcularAjudaCusto() {
        return getSalario() * 0.1;
    }

    @Override
    public double calcularImpostoRenda() {
        return getSalario() * 0.05;
    }
}
