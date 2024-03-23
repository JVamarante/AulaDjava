public class Smartphone extends Produto {

    private boolean fazLigacao;

    public Smartphone(String nome, int estoque, double preco, boolean fazLigacao) {
        super(nome, estoque, preco);
        this.fazLigacao = fazLigacao;
    }

    public boolean isFazLigacao() {
        return fazLigacao;
    }

    public void setFazLigacao(boolean fazLigacao) {
        this.fazLigacao = fazLigacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Faz ligação: " + (fazLigacao ? "Sim" : "Não");
    }

    @Override
    public String getTipo() {
        return "Smartphone";
    }
}