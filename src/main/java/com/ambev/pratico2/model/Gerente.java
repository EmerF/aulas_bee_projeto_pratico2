package com.ambev.pratico2.model;

public class Gerente extends Funcionarios {

    public Gerente(Long id, String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(id, nome, cpf, telefone, salario, endereco);
    }

    @Override
    public Double calcularImposto() {
        return getSalario()*0.05;
    }
    @Override
    public Double CalcularImposto(){
        return getSalario()*0.1;
    }
}
