import java.util.Scanner;
public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();

        Produto produto = new Produto(quantidadeAtual, quantidadeMaxima, quantidadeMinima);

        produto.verificarNecessidadeCompra();

        scanner.close();
    }
}