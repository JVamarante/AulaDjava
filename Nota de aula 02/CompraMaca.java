import java.util.Scanner;

public class CompraMaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidadeDeMacas = scanner.nextInt();

        Maca maca = new Maca(quantidadeDeMacas);

        double custoTotal = maca.calcularCustoTotal();

        System.out.println("O custo total da compra é: R$ " + custoTotal);

        scanner.close();
    }
}