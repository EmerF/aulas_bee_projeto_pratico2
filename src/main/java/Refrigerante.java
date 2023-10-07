public class Refrigerante extends Produto {
    private boolean comAcucar;

    public Refrigerante(int id, String descricao, double preco, boolean comAcucar) {
        super(id, descricao, preco);
        this.comAcucar = comAcucar;
    }

    // Getter e Setter específico para comAcucar
    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
