public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void opcaoEspecial() {
        System.out.println("Calculando rendimento...");
    }
}