import java.util.ArrayList;

public class Main {
    public static ArrayList<Carro> carros = new ArrayList<>();

    public static MainMenu menu = new MainMenu();
    public static Search search = new Search();

    public static void main(String[] args) {
        menu.setVisible(true);
    }
}
