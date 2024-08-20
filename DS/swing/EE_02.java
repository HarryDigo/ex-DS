//só tem que mudar umas 3 linhas do exercicio 1 para o 2

import java.awt.*;
import javax.swing.*;

public class EE_02 extends JFrame {
    private final JLabel lblNome, lblEnd, lblCid, lblEst;
    private final JTextField txtNome, txtEnd, txtCid, txtEst;
    private final JButton btnOk, btnCancel;

    public EE_02 () {
        super("Exemplo GridLayout");
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
        EE_02 ex2 = new EE_02();
        ex2.setVisible(true);
    }
}