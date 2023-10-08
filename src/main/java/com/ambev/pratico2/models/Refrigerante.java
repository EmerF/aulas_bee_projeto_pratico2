package com.ambev.pratico2.models;

public class Refrigerante extends Produto{
    private boolean comAcucar;

    public Refrigerante(String descricao, double preco, boolean comAcucar) {
        super(descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean getComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
