public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return 0.1 * salario;
    }

    
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", " + super.toString() +
                '}';
    }
}
