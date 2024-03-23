public abstract class Produto {
    protected String nome;
    protected int estoque;
    protected double preco;

    public Produto(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public abstract void vender();
}