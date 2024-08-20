import java.awt.*;
import javax.swing.*;

public class EE_01 extends JFrame {
    private final JLabel lblNome, lblEnd, lblCid, lblEst;
    private final JTextField txtNome, txtEnd, txtCid, txtEst;
    private final JButton btnOk, btnCancel;

    public EE_01 () {
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