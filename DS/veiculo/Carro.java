public class Carro extends Veiculo {
    private int qtdPortas;
    private int qtdBancos;
    private double espacoMalas;

    Carro() {super();}

    public void setQtdPortas (int qtdPortas) {this.qtdPortas = qtdPortas;}

    public void setQtdBancos (int qtdBancos) {this.qtdBancos = qtdBancos;}

    public void setEspacoMalas (double espacoMalas) {this.espacoMalas = espacoMalas;}

    public int getQtdPortas() {return qtdPortas;}

    public int getQtdBancos() {return qtdBancos;}

    public double getEspacoMalas() {return espacoMalas;}
}
