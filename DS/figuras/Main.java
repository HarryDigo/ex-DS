public class Main {
    public static void main(String[] args) {
        Figura circulo1 = new Circulo(23);
        Figura quadrado1 = new Quadrado(42);
        Figura cubo1 = new Cubo(7);

        System.out.printf("Área do Círculo: %.4f\nÁrea do quadrado: %.2f\n\nÁrea total do cubo: %.2f\nVolume do cubo: %.2f", circulo1.calcArea(), quadrado1.calcArea(), cubo1.calcArea(), cubo1.calcVol());
    }
}