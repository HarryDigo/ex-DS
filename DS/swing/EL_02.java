import  java.awt.*;
import javax.swing.*;

public class EL_02 extends JFrame {
    private final JTextField txtCalc;
    private final JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnEqual, btnSum, btnSub, btnMult, btnDiv;
    private final JPanel panel1, panel2;

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

    public static void main(String[] args) {
        EL_02 ex4 = new EL_02();
        ex4.setVisible(true);
    }
}