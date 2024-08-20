import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;


public class EL_02 extends JFrame {
    private final JTextField txtCalc;
    private final JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnEqual, btnSum, btnSub, btnMult, btnDiv;
    private final JPanel panel1, panel2;

    private String operation = "";
    private ArrayList<String> elements;
    private ArrayList<String> result;

    public EL_02 () {
        super("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtCalc = new JTextField(15);
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

        txtCalc.setEditable(false);

        btnEqual.addActionListener((actionEvent) -> {
            elements = new ArrayList<>(Arrays.asList(operation.split("\\s+")));
            result = evaluate(elements);
            System.out.println(result.toString());
        });

        btnSum.addActionListener((actionEvent) -> {
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
        
        panel1 = new JPanel();
        panel2 = new JPanel();

        Container window;
        window = getContentPane();
        window.setLayout(new BorderLayout());

        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(4, 4));

        panel1.add(txtCalc);

        panel2.add(btn7);
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

        window.add(panel1, BorderLayout.NORTH);
        window.add(panel2, BorderLayout.CENTER);

        pack();
    }

    private static ArrayList<String> evaluate(ArrayList<String> elements) {
        System.out.println(elements.toString());
        double x, y;
        int i = 0;

        if(elements.contains("*") || elements.contains("/")) {
            while(true) {
                if(elements.contains("*") || elements.contains("/")) {
                    if (elements.get(i).equals("*")) {
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x * y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        break;
                    }

                    if (elements.get(i).equals("/")) {
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x / y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        break;
                    }

                    if(i < elements.size() - 1) i++;
                    else i = 0;
                }
                else break;
            }
        }

        i = 0;

        if(elements.contains("+") || elements.contains("-")) {
            while(true) {
                if(elements.contains("+") || elements.contains("-")) {
                    if (elements.get(i).equals("+")) {
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x + y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        break;
                    }

                    if (elements.get(i).equals("-")) {
                        x = MyDouble.tryParse(elements.get(i - 1));
                        y = MyDouble.tryParse(elements.get(i + 1));

                        elements.set(i - 1, Double.toString(x - y));
                        elements.remove(i + 1);
                        elements.remove(i);

                        break;
                    }

                    if(i < elements.size() - 1) i++;
                    else i = 0;
                }
                else break;
            }
        }

        if (elements.size() == 1) return elements;
        else return evaluate(elements);
    }

    public static void main(String[] args) {
        EL_02 ex4 = new EL_02();
        ex4.setVisible(true);
    }
}

class MyDouble {
    public static double tryParse(String value) {
        try {
            return Double.parseDouble(value);
        } catch(NumberFormatException e) {
            return 0;
        }
    }
}