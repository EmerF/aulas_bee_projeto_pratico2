package com.ambev.pratico2.model;

public abstract class Funcionarios extends Endereco {

    private String nome;
    private int cpf;
    private int celular;
    private double salarios;

    public Endereco endereco;


    public Funcionarios(String rua, String bairro, String cidade, String nome, int cpf, int celular, double salarios, Endereco endereco) {
        super(rua, bairro, cidade);
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.salarios = salarios;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public double getSalarios() {
        return salarios;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract double ajudaCusto();

    public abstract double calculoIR();
}
