package com.ambev.pratico2.model;


public class Refrigerante extends Produto {

    private boolean comAcucar;

    public Refrigerante(String nome, String descricao, double preco, boolean comAcucar) {
        super( nome, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}