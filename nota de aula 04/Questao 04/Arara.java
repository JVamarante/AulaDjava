public class Arara extends Animal{
    private int qtdeOvos;

    public Arara() {
        super("Ave", "Voo");
        this.qtdeOvos = 5;
    }
    public int getQtdeOvos(){
        return qtdeOvos;
    }
}
