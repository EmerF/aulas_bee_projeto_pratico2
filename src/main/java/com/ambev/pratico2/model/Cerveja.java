package com.ambev.pratico2.model;

public class Cerveja extends Produto {
    private Boolean temAlcool;

    public Cerveja() {
    }

    public Cerveja(int id, String descricao, Double preco, Boolean temAlcool) {
        super(id, descricao, preco);
        this.temAlcool = temAlcool;
    }

    public Boolean getTemAlcool(){
        return temAlcool;
    }

    public void setTemAlcool(Boolean temAlcool){
        this.temAlcool = temAlcool;
    }
}
