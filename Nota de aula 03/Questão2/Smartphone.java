public class Smartphone extends Produto {
    public Smartphone(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public void ligacao() {
        System.out.println("Realizando ligação...");
    }

    @Override
    public void vender() {
        if (estoque > 0) {
            estoque--;
            System.out.println("Smartphone vendido!");
        } else {
            System.out.println("Estoque esgotado!");
        }
    }
}
