package model;

public class Cerveja extends Produto{

    private boolean comAlcool;

    public Cerveja(Long id, String descrição, String preço) {
        super(id, descrição, preço);
        this.comAlcool = comAlcool;
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }
}
