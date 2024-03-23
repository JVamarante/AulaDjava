public class Televisao extends Produto {
    public Televisao(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public void acessaCanais() {
        System.out.println("Acessando canais...");
    }

    @Override
    public void vender() {
        if (estoque > 0) {
            estoque--;
            System.out.println("Televisão vendida!");
        } else {
            System.out.println("Estoque esgotado!");
        }
    }
}