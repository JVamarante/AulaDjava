class Produto {
    private int quantidadeAtual;
    private int quantidadeMaxima;
    private int quantidadeMinima;
    public Produto(int quantidadeAtual, int quantidadeMaxima, int quantidadeMinima) {
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMaxima = quantidadeMaxima;
        this.quantidadeMinima = quantidadeMinima;
    }
    public int calcularQuantidadeMedia() {
        return (quantidadeMaxima + quantidadeMinima) / 2;
    }
    public void verificarNecessidadeCompra() {
        int quantidadeMedia = calcularQuantidadeMedia();

        // Verifica se a quantidade em estoque é menor que a quantidade média
        if (quantidadeAtual < quantidadeMedia) {
            System.out.println("Efetuar compra");
        } else {
            System.out.println("Não efetuar compra");
        }
    }
}
