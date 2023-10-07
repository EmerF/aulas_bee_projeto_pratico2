package com.ambev.pratico2.model;

public class Cerveja extends Produto{

    private boolean comAlcool;

    public Cerveja(Long id, String descricao, double preco, boolean comAlcool) {
        super(id, descricao, preco);
        this.comAlcool = comAlcool;
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }
}
