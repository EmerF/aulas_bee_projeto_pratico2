package model;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }
    @Override
    public double calculaAjudaCusto() {
        return getSalario() * 0.05;
    }

    @Override
    public double calculaImpostoRenda() {
        return getSalario() * 0.10;
    }
}