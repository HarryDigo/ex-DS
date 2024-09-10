import java.awt.*;
import javax.swing.*;

public class Home extends JFrame {
    private final JButton btnTransaction, btnLogout;
    private final JLabel lblName, lblBal;
    private final JPanel panelBtn, panelTxt1, panelTxt2;

    Home() {
        super("Menu principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout());

        panelTxt1 = new JPanel();
        panelTxt1.setLayout(new FlowLayout());

        panelTxt2 = new JPanel();
        panelTxt2.setLayout(new FlowLayout());

        lblName = new JLabel("Nome:");
        lblBal = new JLabel("Saldo:");
        btnTransaction = new JButton("Operações");
        btnLogout = new JButton("Sair");

        Container window;
        window = getContentPane();
        window.setLayout(new GridLayout(3, 1));

        panelTxt1.add(lblName);
        
        panelTxt2.add(lblBal);

        panelBtn.add(btnTransaction);
        panelBtn.add(btnLogout);

        window.add(panelTxt1);
        window.add(panelTxt2);
        window.add(panelBtn);
        pack();

        btnLogout.addActionListener((actionEvent) -> {
            this.dispose();
            Main.login.setVisible(true);
        });

        btnTransaction.addActionListener((actionEvent) -> {
            this.dispose();
            Main.transaction.setVisible(true);
        });
    }

    public void updateHome() {
        lblName.setText("Nome: "+Main.currentAcc.getName());
        lblBal.setText("Saldo: R$"+Double.toString(Main.currentAcc.getBal()));
    }
}