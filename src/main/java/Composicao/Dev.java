package Composicao;

public class Dev implements Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    private Endereco endereco;

    public Dev(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.endereco = endereco;
    }

    @Override
    public double calcularAjudaDeCusto() {
        return salario * 0.1;
    }

    @Override
    public double calcularImpostoRenda() {
        return salario * 0.05;
    }
}