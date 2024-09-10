import java.util.ArrayList;

public class Main {
    public static ArrayList<Account> accounts = new ArrayList<>();
    public static Account currentAcc;
    
    public static Login login = new Login();
    public static Signup signup = new Signup();
    public static Home home = new Home();
    public static Transaction transaction = new Transaction();

    public static void main(String[] args) {
        login.setVisible(true);
    }
}