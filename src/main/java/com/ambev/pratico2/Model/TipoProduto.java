package com.ambev.pratico2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TipoProduto extends Produto {
    @ManyToOne
    private Tipo tipo;

    public TipoProduto(String descricao, double preco, Tipo tipo) {
        super(descricao, preco);
        this.tipo = tipo;
    }

    public TipoProduto() {

    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}