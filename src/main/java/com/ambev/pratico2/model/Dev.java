package com.ambev.pratico2.model;

public class Dev extends Funcionarios{


    public Dev(String rua, String bairro, String cidade, String nome, int cpf, int celular, double salarios, Endereco endereco) {
        super(rua, bairro, cidade, nome, cpf, celular, salarios, endereco);
    }

    @Override
    public double ajudaCusto(){
        return getSalarios()*0.1;
    }

    @Override
    public double calculoIR(){
        return getSalarios()*0.05;
    }
}
