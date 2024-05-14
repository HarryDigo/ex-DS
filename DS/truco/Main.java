import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static Random rand = new Random();

    public static ArrayList<Carta> deck = new ArrayList<Carta>();
    
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(new Carta(i, j));
            }
        }

        System.out.println(draw().name);
    }

    public static Carta draw() {
        int aux = Main.rand.nextInt(deck.size());
        Carta aux1 = deck.get(aux);
        deck.remove(aux);
        return aux1;
    }
}

class Carta {
    public static String[] ordem = new String[]{"4", "5", "6", "7", "Dama", "Valete", "Rei", "As", "2", "3"};
    public static String[] naipes = new String[]{"ouros", "espadas", "copas", "paus"};
    
    public int id;
    public int value;
    public int naipe;
    public String name;

    Carta(int value, int naipe) {
        this.id = value * 4 + naipe;
        this.value = value;
        this.naipe = naipe;
        this.name = ordem[value] + " de " + naipes[naipe]; 
    }
}