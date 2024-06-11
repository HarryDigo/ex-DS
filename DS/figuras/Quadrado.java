public class Quadrado extends Figura{
    private double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcArea() {
        return Math.pow(lado, 2);
    }
}
