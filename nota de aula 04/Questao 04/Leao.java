public class Leao extends Animal{
    private String pelo;
    public Leao(String classe,String locomocao,String pelo){
        super(classe,locomocao);
        this.pelo = pelo;
    }
    public String getPelo(){
        return pelo;
    }
    public void exibirInformacoes(){
        System.out.println("Classe: " + getClasse());
        System.out.printf("Locomoção: " + getLocomocao());
        System.out.println("Pelo: " + getPelo());
    }

}
