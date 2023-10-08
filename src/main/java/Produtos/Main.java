package Produtos;

public class Main {

    public static void main(String[] args){

        Produto cerveja = new Cerveja(1, "Brahma",4.5,true);
        Produto refrigerante = new Refrigerante(2,"Pepsi",7.5,true);

        System.out.println(cerveja.getTipo() + " " + cerveja.getDescricao() + " - R$" + cerveja.getPreco());
        System.out.println(refrigerante.getTipo() + " " + refrigerante.getDescricao() + " - R$" + refrigerante.getPreco());
    }
}

