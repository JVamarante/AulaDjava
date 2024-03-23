public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do gerente:");
        String nomeGerente = scanner.nextLine();

        System.out.println("Digite o salário do gerente:");
        double salarioGerente = scanner.nextDouble();

        System.out.println("Digite o departamento do gerente:");
        String departamentoGerente = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, salarioGerente, departamentoGerente);

        System.out.println("Digite o nome do diretor:");
        String nomeDiretor = scanner.nextLine();

        System.out.println("Digite o salário do diretor:");
        double salarioDiretor = scanner.nextDouble();

        System.out.println("Digite a quantidade de ações do diretor:");
        int acoesDiretor = scanner.nextInt();

        Diretor diretor = new Diretor(nomeDiretor, salarioDiretor, acoesDiretor);

        System.out.println("Dados do Gerente:");
        System.out.println(gerente);
        System.out.println("Bônus do gerente: R$" + gerente.calcularBonus());

        System.out.println("\nDados do Diretor:");
        System.out.println(diretor);
        System.out.println("Bônus do diretor: R$" + diretor.calcularBonus());
    }
}
