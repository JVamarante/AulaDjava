import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();

        System.out.println("Selecione o tipo de conta (1 - Conta Corrente, 2 - Conta Poupança):");
        int tipoConta = scanner.nextInt();

        Conta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(titular);
        } else {
            conta = new ContaPouponca(titular);
        }

        System.out.println("Menu de opções:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Opção especial");
        System.out.println("4 - Exibir dados da conta");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor a depositar:");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 2:
                System.out.println("Digite o valor a sacar:");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;
            case 3:
                conta.opcaoEspecial();
                break;
            case 4:
                conta.exibirDados();
                break;
        }

        scanner.close();
    }
}