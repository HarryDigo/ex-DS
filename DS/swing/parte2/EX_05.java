import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings({"unchecked", "rawtypes"})
public class EX_05 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JPanel panel1, panel2;
    private final JComboBox combo;
    private final JCheckBox check1, check2;
    private final JButton btn1, btn2;

    
    EX_05() {
        super("Color Select");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        combo = new JComboBox();
        combo.addItem("RED");
        combo.addItem("GREEN");
        combo.addItem("BLUE");

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        check1 = new JCheckBox("Background");
        check2 = new JCheckBox("Foreground");

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        btn1 = new JButton("OK");
        btn2 = new JButton("Cancel");

        Container janela;
        janela = getContentPane();
        janela.setLayout(new GridLayout(3, 1));

        panel1.add(check1);
        panel1.add(check2);

        panel2.add(btn1);
        panel2.add(btn2);

        janela.add(combo);
        janela.add(panel1);
        janela.add(panel2);

        pack();
    }

    public static void main(String[] args) {
        EX_05 frame = new EX_05();
        frame.setVisible(true);
    }
}
