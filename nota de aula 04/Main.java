import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor p = new Professor();

        Aluno a = new Aluno();

        System.out.println("Digite o nome do Aluno: ");
        a.setNome(scanner.next());

        System.out.println("Digite a idade do Aluno: ");
        a.setIdade(scanner.nextInt());

        System.out.println("Digite a matricula do Aluno: ");
        a.setMatricula(scanner.nextInt());

        System.out.println("Digite o nome do Professor: ");
        p.setNome(scanner.next());

        System.out.println("Digite a idade do Professor: ");
        p.setIdade(scanner.nextInt());

        System.out.println("Digite o salário do Professor: ");
        p.setSalario(scanner.nextInt());

        System.out.println("O nome do Aluno e: " + a.getNome());
        System.out.println("A idade do Alnuo e: " + a.getIdade());
        System.out.println("A matricula do Aluno e: " + a.getMatricula());
        System.out.println("O nome do Professor e: " + p.getNome());
        System.out.println("A idade do Professor e: " + p.getIdade());
        System.out.println("O salário do Professor e: " + p.getSalario());

    }
}
