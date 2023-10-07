public class Gerente extends Funcionario implements FuncionarioContrato {

    public Gerente(String nome, String cpf, String telefone, double salario, Endereco endereco) {
        super(nome, cpf, telefone, salario, endereco);
    }

    @Override
    public double calcularAjudaCusto() {
        return 0.05 * getSalario();
    }

    @Override
    public double calcularImpostoRenda() {
        return 0.10 * getSalario();
    }
}
