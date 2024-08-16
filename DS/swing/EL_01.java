//tem que mudar um pouco mais por causa do layout, mas ainda assim

import java.awt.*;
import javax.swing.*;

public class EL_01 extends JFrame {
    private final JLabel lblNome, lblEnd, lblCid, lblEst;
    private final JTextField txtNome, txtEnd, txtCid, txtEst;
    private final JButton btnOk, btnCancel;
    private final JPanel panel1, panel2, panel3;

    public EL_01 () {
        super("Exemplo FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblNome = new JLabel("Nome: ");
        lblEnd = new JLabel("Endereço: ");
        lblCid = new JLabel("Cidade: ");
        lblEst = new JLabel("Estado: ");
        txtNome = new JTextField(15);
        txtEnd = new JTextField(20);
        txtCid = new JTextField(15);
        txtEst = new JTextField(2);
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancelar");

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        Container window;
        window = getContentPane();
        window.setLayout(new BorderLayout());

        panel1.setLayout(new GridLayout(4, 1));
        panel2.setLayout(new GridLayout(4, 1));
        panel3.setLayout(new FlowLayout());

        panel1.add(lblNome);
        panel1.add(lblEnd);
        panel1.add(lblCid);
        panel1.add(lblEst);

        panel2.add(txtNome);
        panel2.add(txtEnd);
        panel2.add(txtCid);
        panel2.add(txtEst);
        
        panel3.add(btnOk);
        panel3.add(btnCancel);

        window.add(panel1, BorderLayout.WEST);
        window.add(panel2, BorderLayout.CENTER);
        window.add(panel3, BorderLayout.SOUTH);

        pack();
    }

    public static void main(String[] args) {
        EL_01 ex3 = new EL_01();
        ex3.setVisible(true);
    }
}