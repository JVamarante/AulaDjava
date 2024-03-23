class Maca {

    private int quantidade;

    public Maca(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularCustoTotal() {
        double custoUnitario;

        if (quantidade < 12) {
            custoUnitario = 1.30;
        } else {
            custoUnitario = 1.00;
        }

        return quantidade * custoUnitario;
    }
}
