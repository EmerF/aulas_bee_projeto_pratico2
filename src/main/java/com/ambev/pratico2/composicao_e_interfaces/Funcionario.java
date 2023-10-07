package com.ambev.pratico2.composicao_e_interfaces;

public class Funcionario {
    private String nome;
    private Double salario;
    private String telefone;
    private String cpf;
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario, String telefone, String cpf, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
