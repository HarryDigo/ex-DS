public class Cubo extends Figura{
    private double aresta;

    Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double calcArea() {
        return 6*Math.pow(aresta, 2);
    }

    public double calcVol() {
        return Math.pow(aresta, 3);
    }
}
