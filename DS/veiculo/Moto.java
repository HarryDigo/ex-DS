public class Moto extends Veiculo {
    private String tipo;
    private boolean marcha;
    private boolean parabrisa;

    Moto() {super();}

    public void setTipo (String tipo) {this.tipo = tipo;}

    public void setMarcha (boolean marcha) {this.marcha = marcha;}

    public void setParabrisa (boolean parabrisa) {this.parabrisa = parabrisa;}

    public String getTipo() {return tipo;}

    public boolean getMarcha() {return marcha;}

    public boolean getParabrisa() {return parabrisa;}
}
