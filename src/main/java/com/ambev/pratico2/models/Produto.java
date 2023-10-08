package com.ambev.pratico2.models;

public class Produto {
    private String id;
    private String descricao;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, String descricao, Double preco) {
        this.id = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(final String descricao, final double preco) {

    }

    public String getNome() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}
