import java.awt.*;
import javax.swing.*;

public class Signup extends JFrame {
    private final JTextField txtName, txtPassw;
    private final JButton btnCancel, btnSignup;
    private final JLabel lblName, lblPassw;
    private final JPanel panelBtn, panelTxt1, panelTxt2;

    Signup() {
        super("Criar conta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout());

        panelTxt1 = new JPanel();
        panelTxt1.setLayout(new FlowLayout());

        panelTxt2 = new JPanel();
        panelTxt2.setLayout(new FlowLayout());

        lblName = new JLabel("Nome:");
        lblPassw = new JLabel("Senha:");
        txtName = new JTextField(20);
        txtPassw = new JTextField(15);
        btnCancel = new JButton("Cancelar");
        btnSignup = new JButton("Criar conta");

        Container window;
        window = getContentPane();
        window.setLayout(new GridLayout(3, 1));

        panelTxt1.add(lblName);
        panelTxt1.add(txtName);
        
        panelTxt2.add(lblPassw);
        panelTxt2.add(txtPassw);

        panelBtn.add(btnSignup);
        panelBtn.add(btnCancel);

        window.add(panelTxt1);
        window.add(panelTxt2);
        window.add(panelBtn);
        pack();

        btnCancel.addActionListener((actionEvent) -> {
            this.dispose();
            Main.login.setVisible(true);
        });

        btnSignup.addActionListener((actionEvent) -> {
            String name = txtName.getText();
            String passw = txtPassw.getText();

            if (name.isBlank() || passw.isBlank()) {
                JOptionPane.showMessageDialog(Main.signup, "Insira os valores corretamente");
                return;
            }

            if (Account.names.contains(name)) {
                JOptionPane.showMessageDialog(Main.signup, "Conta já existe, tente novamente");
                return;
            }

            Main.accounts.add(new Account(name, passw));
            this.dispose();
            Main.login.setVisible(true);
        });
    }
}