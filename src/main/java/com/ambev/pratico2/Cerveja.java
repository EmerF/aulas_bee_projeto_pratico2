package com.ambev.pratico2;

public class Cerveja extends Produto {
    private boolean comAlcool;

    public Cerveja() {
        // Construtor vazio uma boa pratica para caso haja a necessidad de crisr ou modificar
    }

    public Cerveja(int id, String descricao, double preco, boolean comAlcool) {
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
