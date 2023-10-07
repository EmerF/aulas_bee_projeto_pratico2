package com.ambev.pratico2.composicao_e_interfaces;

public class Gerente extends Funcionario implements FuncionariosRendimentos {

    public Gerente () {
    }

    public Gerente(String nome, Double salario, String telefone, String cpf, Endereco endereco) {
        super(nome, salario, telefone, cpf, endereco);
    }

    @Override
    public Double ajudaCusto() {
        return getSalario()*0.05;
    }

    @Override
    public Double impostoRenda() {
        return getSalario()*0.1;
    }

    @Override
    public Double salarioLiquido() {
        return getSalario()-impostoRenda()+ajudaCusto();
    }
}
