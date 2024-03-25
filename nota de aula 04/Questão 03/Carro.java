public class Carro {
    private String Marca;
    private String Modelo;

    public Carro(String marca, String modelo){
        this.Marca = marca;
        this.Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String modelo){
        Modelo = modelo;
    }

    public void mostraDetalhes() {

    }
}
