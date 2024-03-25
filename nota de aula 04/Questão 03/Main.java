import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Carro carro = new Carro("Toyota", "Corolla");
        carro.mostraDetalhes();

        System.out.println("O Marca do carro e: " + carro.getMarca());
        System.out.printf("O modelo do carro e: " + carro.getModelo());

    }
}