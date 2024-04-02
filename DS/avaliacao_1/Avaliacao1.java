//Rodrigo Scatolin Flora do Rio 2º DS
import javax.swing.JOptionPane;

public class Avaliacao1 {
    public static void main(String[] args) {
        String op;
        while(true){
            op = JOptionPane.showInputDialog("Escolha entre as operações:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Área de um quadrado\n6 - Área de um retângulo\n7 - Área de um Círculo\n8 - Consumo de combustível\n0 - Sair");
            switch (op) {
                case "0":
                    return;
                case "1":
                    Operacoes.soma();
                    break;
                case "2":
                    Operacoes.subtracao();
                    break;
                case "3":
                    Operacoes.multiplicacao();
                    break;
                case "4":
                    Operacoes.divisao();
                    break;
                case "5":
                    Operacoes.areaQuadrado();
                    break;
                case "6":
                    Operacoes.areaRetangulo();
                    break;
                case "7":
                    Operacoes.areaCirculo();
                    break;  
                case "8":
                    Operacoes.consumo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}