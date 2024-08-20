import java.awt.*; //imports
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;


public class EL_02 extends JFrame {
    private final JTextField txtCalc; //variaveis de objetos do JFrame
    private final JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnEqual, btnSum, btnSub, btnMult, btnDiv;
    private final JPanel panel1, panel2;

    private String operation = ""; //string da operação
    private ArrayList<String> elements; //ArrayList dos objetos da operação
    public static boolean error = false; //bool no caso de erro

    public EL_02 () {
        super("Calculadora"); //titulo e xsinho fecha
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtCalc = new JTextField(15); //objetos ligados as variaveis
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDot = new JButton(".");
        btnEqual = new JButton("=");
        btnSum = new JButton("+");
        btnSub = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");

        txtCalc.setEditable(false); //desligar ações no JTextField

        btnEqual.addActionListener((actionEvent) -> { //evento de calcular a equação
            elements = new ArrayList<>(Arrays.asList(operation.split("\\s+"))); //separação da String em elementos individuais

            evaluate(elements); //função recursiva do calculo

            if (error == true) { //checa se a operação estava errada
                error = false;
                operation = ""; //zerar a operação
                JOptionPane.showMessageDialog(null, "Operação Inválida");
            } else {
                operation = elements.get(0); //pega o 1° (unico) elemento da lista, portanto o resultado
            }

            txtCalc.setText(operation); //comum em todos os eventos, só para atualizar o texto
        });

        btnSum.addActionListener((actionEvent) -> { //todos os eventos (só adicionam coisas à String da operação)
            operation += " + ";
            txtCalc.setText(operation);
        });

        btnSub.addActionListener((actionEvent) -> {
            operation += " - ";
            txtCalc.setText(operation);
        });

        btnMult.addActionListener((actionEvent) -> {
            operation += " * ";
            txtCalc.setText(operation);
        });

        btnDiv.addActionListener((actionEvent) -> {
            operation += " / ";
            txtCalc.setText(operation);
        });

        btn0.addActionListener((actionEvent) -> {
            operation += "0";
            txtCalc.setText(operation);
        });

        btn1.addActionListener((actionEvent) -> {
            operation += "1";
            txtCalc.setText(operation);
        });

        btn2.addActionListener((actionEvent) -> {
            operation += "2";
            txtCalc.setText(operation);
        });

        btn3.addActionListener((actionEvent) -> {
            operation += "3";
            txtCalc.setText(operation);
        });

        btn4.addActionListener((actionEvent) -> {
            operation += "4";
            txtCalc.setText(operation);
        });

        btn5.addActionListener((actionEvent) -> {
            operation += "5";
            txtCalc.setText(operation);
        });

        btn6.addActionListener((actionEvent) -> {
            operation += "6";
            txtCalc.setText(operation);
        });

        btn7.addActionListener((actionEvent) -> {
            operation += "7";
            txtCalc.setText(operation);
        });

        btn8.addActionListener((actionEvent) -> {
            operation += "8";
            txtCalc.setText(operation);
        });

        btn9.addActionListener((actionEvent) -> {
            operation += "9";
            txtCalc.setText(operation);
        });

        btnDot.addActionListener((actionEvent) -> {
            operation += ".";
            txtCalc.setText(operation);
        });
        
        panel1 = new JPanel(); //paineis
        panel2 = new JPanel();

        Container window; //janela com borderlayout
        window = getContentPane();
        window.setLayout(new BorderLayout());

        panel1.setLayout(new FlowLayout()); //ambos os layouts dos paineis
        panel2.setLayout(new GridLayout(4, 4));

        panel1.add(txtCalc); //objeto painel 1 

        panel2.add(btn7); //objetos painel 2 
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btnDiv);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btnMult);
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btnSub);
        panel2.add(btn0);
        panel2.add(btnDot);
        panel2.add(btnEqual);
        panel2.add(btnSum);

        window.add(panel1, BorderLayout.NORTH); //colocando os paineis no lugar certo
        window.add(panel2, BorderLayout.CENTER);

        pack(); //colocando o tamanho da janela automaticamente
    }

    private static ArrayList<String> evaluate(ArrayList<String> elements) { //função do calculo da equação (segue a ordem de operações!!!)
        System.out.println(elements.toString()); //mostra a lista dos elementos para debug
        double x, y; //bla bla bla variaveis
        int i = 0;
        String auxString;

        auxString = elements.get(elements.size() - 1); //pega o ultimo elemento

        if ("+".equals(auxString) || "-".equals(auxString) || "*".equals(auxString) || "/".equals(auxString)) { //checa se o ultimo é valido (não achei outro jeito de fazer :( )
            error = true;
            return elements;
        }

        if(elements.contains("*") || elements.contains("/")) { //checa a presença de multiplicação ou divisão
            while(true) { //loop dos multiplicaçonos
                if(elements.contains("*") || elements.contains("/")) { //parece redundante, mas é para checar se já foram feitas todas as operações dessa parte só que dentro do loop
                    if (elements.get(i).equals("*")) { //checa localização atual para mult
                        x = MyDouble.tryParse(elements.get(i - 1)); //pega o elemento antes e depois do sinal
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x * y)); //coloca o resultado da operção individual no 1° dos 3 lugares da equação
                        elements.remove(i + 1); //deleta os outros 2
                        elements.remove(i);

                        System.out.println(elements.toString()); //debug de novo
                        break; //1 das 2 coisas que esqueci como funciona mas quebra sem
                    }

                    if (elements.get(i).equals("/")) { //mesma coisa para a divisão
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x / y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        System.out.println(elements.toString());
                        break;
                    }

                    if (i == elements.size()) i = 0; //reseta o i se ele for ficar maior que a lista (nojo)
                    else i++; //incremento wow
                }
                else return evaluate(elements); //roda a função de novo para fazer o resto
            }
        }

        i = 0; //outra coisa que não sei como funciona mas quebra sem, tipo eu literalmente coloquei como 0 antes (linha 169), mas se tira quebra (ex. que quebra: 34.0 + 5 + 5 * 5)
        
        if(elements.contains("+") || elements.contains("-")) { //igual aos outros só que para soma e subtração
            while(true) {
                if(elements.contains("+") || elements.contains("-")) {
                    if (elements.get(i).equals("+")) {
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x + y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        System.out.println(elements.toString());
                        break;
                    }

                    if (elements.get(i).equals("-")) {
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x - y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        System.out.println(elements.toString());
                        break;
                    }

                    if (i == elements.size() - 1) i = 0;
                    else i++;
                }
                else return evaluate(elements);
            }
        }

        MyDouble.tryParse(elements.get(0)); //ve se o primeiro elemento é valido (util para quando o "." é usado errado (ex. 5.55.2))

        if (elements.size() == 1) return elements; //checa se só tem o resultado sobrando
        else return evaluate(elements); //faz a recursão no caso de algo ter ido errado
    }

    public static void main(String[] args) { //só as coisa para rodar o JFrame
        EL_02 ex4 = new EL_02();
        ex4.setVisible(true);
    }
}

class MyDouble { //classe para testar parse
    public static double tryParse(String value) {
        try {
            return Double.parseDouble(value);
        } catch(NumberFormatException e) {
            EL_02.error = true; //usado para mandar mensagem de erro no calculo
            return 0;
        }
    }
}