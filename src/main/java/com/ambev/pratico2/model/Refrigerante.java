package com.ambev.pratico2.model;

public class Refrigerante extends Produto {

    private boolean comAcucar;

    public Refrigerante(int id, String nome, String descricao, double preco, boolean comAcucar) {
        super(id, nome, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isSemAlcool() {
        return comAcucar;
    }

    public void setSemAlcool(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
