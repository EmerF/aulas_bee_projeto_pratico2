package com.ambev.pratico2.composicaoInterfaces;

public class Dev extends Funcionario implements FuncionariosRendimentos {
    private Dev(){
    }

    private Dev(String nome, Double salario, String telefone, String cpf, Endereco endereco){
    super(nome, salario, telefone, cpf, endereco);
    }

    @Override
    public Double ajudaCusto() {
        return getSalario()*0.1;
    }

    @Override
    public Double impostoRenda() {
        return getSalario()*0.05;
    }

    @Override
    public Double salarioLiquido() {
        return getSalario()-impostoRenda()+ajudaCusto();
    }
}
