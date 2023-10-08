package com.ambev.pratico2.model;

import com.ambev.pratico2.interfaces.CalculoAjudaCusto;
import com.ambev.pratico2.interfaces.ImpostoRenda;

public abstract class Funcionarios implements CalculoAjudaCusto, ImpostoRenda {
    
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    private Endereco endereco;

   
    public Funcionarios(String nome, String cpf, String telefone, double salario, Endereco endereco) {
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
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
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
