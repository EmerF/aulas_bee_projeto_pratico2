package com.ambev.pratico2.models;

public class Refrigerante extends Produto{
    private boolean comAcucar;

    public Refrigerante(String descricao, double preco, boolean comAcucar) {
        super(descricao, preco);
        this.comAcucar = comAcucar;
    }
}
