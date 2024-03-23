public class Televisao extends Produto {

    private boolean acessaCanais;

    public Televisao(String nome, int estoque, double preco, boolean acessaCanais) {
        super(nome, estoque, preco);
        this.acessaCanais = acessaCanais;
    }

    public boolean isAcessaCanais() {
        return acessaCanais;
    }

    public void setAcessaCanais(boolean acessaCanais) {
        this.acessaCanais = acessaCanais;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Acessa canais: " + (acessaCanais ? "Sim" : "Não");
    }

    public String getTipo() {
        return "Televisao";
    }
}
