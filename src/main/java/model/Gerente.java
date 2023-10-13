package model;

import jakarta.persistence.Entity;

@Entity
public class Gerente extends Funcionario {
    @Override
    public double calcularAjudaCusto() {
        return 0.05 * getSalario();
    }

    @Override
    public double calcularImpostoRenda() {
        return 0.10 * getSalario();
    }
}
