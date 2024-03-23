public abstract class Produto {

    private String nome;
    private int estoque;
    private double preco;

    public Produto(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "Estoque: " + estoque + "\n" +
                "Preço: R$" + String.format("%.2f", preco);
    }

    public abstract String getTipo();
}
