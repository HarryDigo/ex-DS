import javax.swing.JOptionPane;
public class Teste {
    public static void main (String[] args) {
        String oi = JOptionPane.showInputDialog("Digite seu nome:");
        float x = MyFloat.tryParse(JOptionPane.showInputDialog(oi+", digite um número para calcular o dobro"))*2;
        JOptionPane.showMessageDialog(null, String.format("o dobro do número é: %.2f",x));
    }
}