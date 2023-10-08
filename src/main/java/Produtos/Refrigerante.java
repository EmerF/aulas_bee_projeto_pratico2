package Produtos;

public class Refrigerante extends Produto {
    private boolean comAcucar;

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }

    public Refrigerante(int id, String descricao, double preco, boolean comAcucar) {
        super(id, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    @Override
    public String getTipo() {
        return "Refrigerante";
    }
}