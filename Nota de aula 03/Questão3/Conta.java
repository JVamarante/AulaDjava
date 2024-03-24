public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public abstract void opcaoEspecial();
}
