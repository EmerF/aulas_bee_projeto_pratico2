public class Cerveja extends Produto {
    private boolean comAlcool;

    public Cerveja(int id, String descricao, double preco, boolean comAlcool) {
        super(id, descricao, preco);
        this.comAlcool = comAlcool;
    }

    // Getter e Setter
    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }
}
