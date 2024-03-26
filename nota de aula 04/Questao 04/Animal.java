public class Animal {
    private String classe;
    private String locomocao;

    public  Animal(String classe, String locomocao){
        this.classe = classe;
        this.locomocao = locomocao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getLocomocao(){
        return  locomocao;
    }
    public void setLocomocao(String locomocao){
        this.locomocao = locomocao;
    }
}

