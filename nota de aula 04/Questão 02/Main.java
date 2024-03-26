public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Descrição: " + produto1.getDescricao());
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Descrição: " + produto2.getDescricao());
    }
}