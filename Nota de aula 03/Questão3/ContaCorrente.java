public class ContaCorrente extends Conta {
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void opcaoEspecial() {
        System.out.println("Usando cheque especial...");
    }
}