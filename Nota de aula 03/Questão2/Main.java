public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("TV Samsung", 10, 2000.00);
        tv.vender();
        tv.acessaCanais();

        Smartphone smartphone = new Smartphone("iPhone", 5, 7000.00);
        smartphone.vender();
        smartphone.ligacao();
    }
}