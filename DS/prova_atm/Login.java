import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
    private final JTextField txtUser, txtPassw;
    private final JButton btnOk, btnSignup;
    private final JLabel lblUser, lblPassw;
    private final JPanel panelBtn, panelTxt1, panelTxt2;

    Login() {
        super("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout());

        panelTxt1 = new JPanel();
        panelTxt1.setLayout(new FlowLayout());

        panelTxt2 = new JPanel();
        panelTxt2.setLayout(new FlowLayout());

        lblUser = new JLabel("Usuário (nome):");
        lblPassw = new JLabel("Senha:");
        txtUser = new JTextField(20);
        txtPassw = new JTextField(15);
        btnOk = new JButton("OK");
        btnSignup = new JButton("Criar conta");

        Container window;
        window = getContentPane();
        window.setLayout(new GridLayout(3, 1));

        panelTxt1.add(lblUser);
        panelTxt1.add(txtUser);
        
        panelTxt2.add(lblPassw);
        panelTxt2.add(txtPassw);

        panelBtn.add(btnOk);
        panelBtn.add(btnSignup);

        window.add(panelTxt1);
        window.add(panelTxt2);
        window.add(panelBtn);
        pack();

        btnSignup.addActionListener((actionEvent) -> {
            this.dispose();
            Main.signup.setVisible(true);
        });

        btnOk.addActionListener((actionEvent) -> {
            String name = txtUser.getText();
            String passw = txtPassw.getText();
            
            if (!Account.names.contains(name)) {
                JOptionPane.showMessageDialog(Main.login, "Conta não existe, tente novamente");
                return;
            }
            
            Account aux = Main.accounts.get(Account.names.indexOf(name));
            
            if (passw.equals(aux.getPassw())) {
                Main.currentAcc = aux;
                this.dispose();
                Main.home.updateHome();
                Main.home.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(Main.login, "Senha incorreta, tente novamente");
            }
        });
    }
}