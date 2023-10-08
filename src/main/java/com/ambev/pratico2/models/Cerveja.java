package com.ambev.pratico2.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
    public class Cerveja extends Produto {
        private boolean comAlcool;

        public Cerveja(String descricao, double preco, boolean comAlcool) {
            super(descricao, preco);
            this.comAlcool = comAlcool;
        }
}