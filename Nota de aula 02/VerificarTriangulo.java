import java.util.Scanner;
public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.verificarTriangulo()) {
            triangulo.determinarTipoTriangulo();
        } else {
            System.out.println("Não é possível formar um triângulo com esses comprimentos.");
        }
        scanner.close();
    }
}