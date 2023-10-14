package com.ambev.pratico2.model;

public class Cerveja extends Produto {

    private boolean comAlcool;

    public Cerveja( String nome, String descricao, double preco, boolean comAlcool) {
        super( nome, descricao, preco);
        this.comAlcool = comAlcool;
    }

    public Cerveja() {
        super();
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }


}