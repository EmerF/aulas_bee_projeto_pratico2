package com.ambev.pratico2.models;

import lombok.Data;
@Data
public class Gerente extends Funcionario implements CalculoImpostoRenda, CalculoAjudaCusto {
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    private Endereco endereco;

    @Override
    public double calcularAjudaCusto() {
        return salario * 0.05;
    }

    @Override
    public double calcularImpostoRenda() {
        return salario * 0.10;
    }
}
