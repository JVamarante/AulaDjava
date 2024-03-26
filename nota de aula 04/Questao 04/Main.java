import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Leao leao = new Leao("Mamífero","Patas","Jubas");
        Arara arara = new Arara();

        System.out.println("Informaçães do Leão: ");
        System.out.println(leao.getClasse());
        System.out.println(leao.getLocomocao());
        System.out.println(leao.getPelo());


        System.out.println("Informaçãoes da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdeOvos());
    }
}