package model.heranca.polimorfismo;

public class Refrigerante extends Produto {
    private boolean comAcucar;

    public Refrigerante(int id, String nome, String descricao, double preco, boolean comAcucar) {
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

