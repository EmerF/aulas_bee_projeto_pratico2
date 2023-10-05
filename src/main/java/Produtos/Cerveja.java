package Produtos;

public class Cerveja extends Produto {
    private boolean comAlcool;

    public Cerveja(int id, String descricao, double preco, boolean comAlcool) {
        super(id, descricao, preco);
        this.comAlcool = comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    @Override
    public String getTipo() {
        return "Cerveja";
    }
}