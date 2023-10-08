package model.composicao.interfaces;

public class Dev extends Funcionario {

    public Dev (String nome, String cpf, String telefone, double salario, model.composicao.interfaces.Endereco endereco) {
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

    @Override
    public double calculaImposto() {
        return 0;
    }
}
