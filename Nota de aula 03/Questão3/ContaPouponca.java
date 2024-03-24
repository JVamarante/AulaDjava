public class ContaPouponca extends Conta {
    public ContaPouponca(String titular) {
        super(titular);
    }

    @Override
    public void opcaoEspecial() {
        System.out.println("Calculando rendimento...");
    }

    @Override
    public String toString() {
        return "ContaPoupanca []";
    }
}