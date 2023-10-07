package model.composicao.interfaces;

public class Dev extends Funcionario {

    public Dev(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }
    @Override
    public double calculaAjudaCusto() {

        return getSalario() * 0.10;
    }

    @Override
    public double calculaImpostoRenda() {
        return getSalario() * 0.05;
    }

}
