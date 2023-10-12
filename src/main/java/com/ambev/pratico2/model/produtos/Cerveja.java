package com.ambev.pratico2.model.produtos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cervejas")
public class Cerveja extends Produto {

    private boolean comAlcool;

    public Cerveja(String id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }

}
