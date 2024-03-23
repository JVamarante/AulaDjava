public class Diretor extends Funcionario {

    private int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "acoes=" + acoes +
                ", " + super.toString() +
                '}';
    }
}
