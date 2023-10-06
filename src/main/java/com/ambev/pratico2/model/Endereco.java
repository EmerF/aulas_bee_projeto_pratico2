package com.ambev.pratico2.model;

public class Endereco {
    private String rua;
    private String Bairro;
    private String Cidade;

    public Endereco(String rua, String bairro, String cidade) {
        this.rua = rua;
        Bairro = bairro;
        Cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }
}
