import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Account {
    public static ArrayList<String> names = new ArrayList<>();

    private String name;
    private String passw;
    private double bal;

    Account(String name, String passw) {
        this.name = name;
        this.passw = passw;
        bal = 0;
        names.add(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getPassw() {
        return passw;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

    public void withdraw(String value) {
        if (!MyDouble.tryParse(value)) {
            JOptionPane.showMessageDialog(Main.transaction, "Insira um valor válido");
            return;
        } else if (Double.parseDouble(value) <= 0) {
            JOptionPane.showMessageDialog(Main.transaction, "Insira um valor maior que 0");
            return;
        }
        bal -= Double.parseDouble(value);
    }

    public void deposit(String value) {
        if (!MyDouble.tryParse(value)) {
            JOptionPane.showMessageDialog(Main.transaction, "Insira um valor válido");
            return;
        } else if (Double.parseDouble(value) <= 0) {
            JOptionPane.showMessageDialog(Main.transaction, "Insira um valor maior que 0");
            return;
        }
        bal += Double.parseDouble(value);
    }
}