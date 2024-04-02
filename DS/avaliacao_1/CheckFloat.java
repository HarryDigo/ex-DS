//Rodrigo Scatolin Flora do Rio 2º DS
import javax.swing.JOptionPane;

public class CheckFloat {
    public static String tryParse(String x) {
        try {
            Float.parseFloat(x);
            return x;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
            return "stop";
        }
    }
}
