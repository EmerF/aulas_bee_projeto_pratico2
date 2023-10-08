package com.ambev.pratico2.modeIFuncionarios;

public abstract class Funcionario implements AjudaCusto, ImpostoRenda {

    private String nome;
    private int cpf;
    private String telefone;
    private double salario;

    private Endereco endereco;

    public Funcionario(String nome, int cpf, String telefone, double salario, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public abstract double calcularAjudaCusto();

    public abstract double calcularImpostoRenda();
}
