package com.ambev.pratico2.model;

public class Dev extends Funcionarios{

    public Dev(Long id, String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(id, nome, cpf, telefone, salario, endereco);
    }

    @Override
    public Double calcularImposto() {
        return getSalario()*0.1;
    }
    @Override
    public Double CalcularImposto(){
        return getSalario()*0.05;
    }
}
