package com.ambev.pratico2;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }

    @Override
    public double calcularAjudaCusto() {
        // Cálculo de Ajuda Custo para Gerente (5% do salário)
        return getSalario() * 0.05;
    }

    @Override
    public double calcularImpostoRenda() {
        // Cálculo de Imposto de Renda para Gerente (10% do salário)
        return getSalario() * 0.10;
    }
}
