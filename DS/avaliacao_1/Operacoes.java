//Rodrigo Scatolin Flora do Rio 2º DS
import javax.swing.JOptionPane;

public class Operacoes {

    public static String input;
    public static float x, y;

    public static void soma() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o primeiro número:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o segundo número:"));
        if (input == "stop") return; else y = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("O resultado de sua operação é: %.2f.",x+y));
        return;
    }
    public static void subtracao() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o primeiro número:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o segundo número:"));
        if (input == "stop") return; else y = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("O resultado de sua operação é: %.2f.",x-y));
        return;
    }
    public static void multiplicacao() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o primeiro número:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o segundo número:"));
        if (input == "stop") return; else y = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("O resultado de sua operação é: %.2f.",x*y));
        return;
    }
    public static void divisao() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o primeiro número:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o segundo número:"));
        if (input == "stop") return; else y = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("O resultado de sua operação é: %.2f.",x/y));
        return;
    }
    public static void areaQuadrado() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o comprimento do lado:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("A área deste quadrado é %.2f.",x*x));
        return;
    }
    public static void areaRetangulo() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o comprimento:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira a largura:"));
        if (input == "stop") return; else y = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("A área deste retângulo é: %.2f.",x*y));
        return;
    }
    public static void areaCirculo() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira o raio:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        double pi = Math.PI;
        JOptionPane.showMessageDialog(null, String.format("A área deste círculo é: %.2f.",pi*x*x));
        return;
    }
    public static void consumo() {
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira os quilometros andados:"));
        if (input == "stop") return; else x = Float.parseFloat(input);
        input = CheckFloat.tryParse(JOptionPane.showInputDialog("Insira a quantidade de quilometros por litro:"));
        if (input == "stop") return; else y = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, String.format("Você gastou: %.2fL de combustível.",x/y));
        return;
    }
}
