package com.ambev.pratico2.model;

public class Refrigerante extends Produto {
    private boolean temAcucar;

    public Refrigerante() {
    }

    public Refrigerante(int id, String descricao, Double preco, boolean temAcucar) {
        super(id, descricao, preco);
        this.temAcucar = temAcucar;
    }

    public Boolean getTemAcucar(){
        return temAcucar;
    }

    public void setTemAcucar(Boolean setTemAcucar){
        this.temAcucar = temAcucar;
    }

}
