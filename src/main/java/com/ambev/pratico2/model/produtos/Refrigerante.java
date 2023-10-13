package com.ambev.pratico2.model.produtos;

import com.ambev.pratico2.model.produtos.Produto;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerantes")
public class Refrigerante extends Produto {

    private boolean comAcucar;

    public Refrigerante(String id, String nome, String descricao, double preco, boolean comAcucar) {
        super(id, nome, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
