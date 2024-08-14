//só tem que mudar umas 3 linhas do exercicio 1 para o 2

import java.awt.*;
import javax.swing.*;

public class EL_01 extends JFrame {
    private JLabel lblNome, lblEnd, lblCid, lblEst;
    private JTextField txtNome, txtEnd, txtCid, txtEst;
    private JButton btnOk, btnCancel;
    private JPanel panel1, panel2, panel3;

    public EL_01 () {
        super("Exemplo FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblNome = new JLabel("Nome: ");
        txtNome = new JTextField(15);
        lblEnd = new JLabel("Endereço: ");
        txtEnd = new JTextField(20);
        lblCid = new JLabel("Cidade: ");
        txtCid = new JTextField(15);
        lblEst = new JLabel("Estado: ");
        txtEst = new JTextField(2);
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancelar");

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        Container window;
        window = getContentPane();
        window.setLayout(new GridLayout(5, 2));

        window.add(lblNome);
        window.add(txtNome);
        window.add(lblEnd);
        window.add(txtEnd);
        window.add(lblCid);
        window.add(txtCid);
        window.add(lblEst);
        window.add(txtEst);
        window.add(btnOk);
        window.add(btnCancel);

        pack();
    }

    public static void main(String[] args) {
        EL_01 ex1 = new EL_01();
        ex1.setVisible(true);
    }
}