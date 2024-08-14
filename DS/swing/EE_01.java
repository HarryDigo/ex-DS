import java.awt.*;
import javax.swing.*;

public class EE_01 extends JFrame {
    private JLabel lblNome, lblEnd, lblCid, lblEst;
    private JTextField txtNome, txtEnd, txtCid, txtEst;
    private JButton btnOk, btnCancel;

    public EE_01 () {
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

        Container window;
        window = getContentPane();
        window.setLayout(new FlowLayout());

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

        setSize(400, 200);
    }

    public static void main(String[] args) {
        EE_01 ex1 = new EE_01();
        ex1.setVisible(true);
    }
}