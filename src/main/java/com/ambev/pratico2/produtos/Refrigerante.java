package com.ambev.pratico2.produtos;

public class Refrigerante extends Produto{
    private boolean comAcucar;

    public Refrigerante(String descricao, double preco, boolean comAcucar) {
        super(descricao, preco);
        this.comAcucar = comAcucar;
    }
}
