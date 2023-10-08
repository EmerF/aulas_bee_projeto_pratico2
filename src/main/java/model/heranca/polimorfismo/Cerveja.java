package model.heranca.polimorfismo;

public class Cerveja extends Produto {
    private boolean temAlcool;

    public Cerveja(int id, String nome, String descricao, double preco, boolean temAlcool) {
        super(id, nome, descricao, preco);
        this.temAlcool = temAlcool;
    }

    public boolean isTemAlcool() {
        return temAlcool;
    }

    public void setTemAlcool(boolean temAlcool) {
        this.temAlcool = temAlcool;
    }
}

