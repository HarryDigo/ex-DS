public class Circulo extends Figura{
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double calcArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
