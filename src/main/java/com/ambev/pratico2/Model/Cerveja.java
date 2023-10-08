package com.ambev.pratico2.Model;

import jakarta.persistence.Entity;

@Entity
public class Cerveja extends TipoProduto {
    private boolean temAlcool;

    public Cerveja(String descricao, double preco, Tipo tipo, boolean temAlcool) {
        super(descricao, preco, tipo);
        this.temAlcool = temAlcool;
    }

    public Cerveja() {

    }

    public boolean isTemAlcool() {
        return temAlcool;
    }

    public void setTemAlcool(boolean temAlcool) {
        this.temAlcool = temAlcool;
    }
}