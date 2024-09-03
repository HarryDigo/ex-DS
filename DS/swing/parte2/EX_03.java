import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class EX_03 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    private final ButtonGroup radioGroup;
    private final JRadioButton radio1, radio2, radio3;
    private final JCheckBox check1, check2, check3, check4;
    private final JButton btn1, btn2, btn3, btn4;
    
    private final JComboBox combo;
    private final JLabel lbl1, lbl2;
    
    public EX_03() {
        super("Printer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1));

        radio1 = new JRadioButton("Selection", false);
        radio2 = new JRadioButton("All", true);
        radio3 = new JRadioButton("Applet", false);
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1));

        check1 = new JCheckBox("Image");
        check2 = new JCheckBox("Text");
        check3 = new JCheckBox("Code");

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(4, 1));

        btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");
        btn3 = new JButton("Setup...");
        btn4 = new JButton("Help");

        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        lbl1 = new JLabel("Print Quality:");

        combo = new JComboBox();
        combo.addItem("High");
        combo.addItem("Medium");
        combo.addItem("Low");

        check4 = new JCheckBox("Print to File");

        Container janela;
        janela = getContentPane();
        janela.setLayout(new BorderLayout());

        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel6 = new JPanel();
        panel6.setLayout(new BorderLayout());

        lbl2 = new JLabel("Printer: MyPrinter");

        panel1.add(radio1);
        panel1.add(radio2);
        panel1.add(radio3);
        
        radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);
        radioGroup.add(radio3);

        panel2.add(check1);
        panel2.add(check2);
        panel2.add(check3);

        panel3.add(btn1);
        panel3.add(btn2);
        panel3.add(btn3);
        panel3.add(btn4);

        panel4.add(lbl1);
        panel4.add(combo);
        panel4.add(check4);

        panel5.add(panel1);
        panel5.add(panel2);

        panel6.add(lbl2, BorderLayout.NORTH);
        panel6.add(panel5, BorderLayout.CENTER);
        panel6.add(panel4, BorderLayout.SOUTH);

        janela.add(panel6, BorderLayout.CENTER);
        janela.add(panel3, BorderLayout.EAST);
        pack();
    }

    public static void main(String[] args) {
        EX_03 frame = new EX_03();
        frame.setVisible(true);
    }
}