import java.awt.*;
import javax.swing.*;

public class Transaction extends JFrame{
    private final JButton btnWithdraw, btnDeposit, btnExit;

    Transaction () {
        super("Transações");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnWithdraw = new JButton("Saque");
        btnDeposit = new JButton("Depósito");
        btnExit = new JButton("Voltar");

        Container window;
        window = getContentPane();
        window.setLayout(new BorderLayout());

        window.add(btnWithdraw, BorderLayout.NORTH);
        window.add(btnDeposit, BorderLayout.CENTER);
        window.add(btnExit, BorderLayout.SOUTH);

        pack();

        btnExit.addActionListener((actionEvent) -> {
            this.dispose();
            Main.home.updateHome();
            Main.home.setVisible(true);
        });

        btnWithdraw.addActionListener((ActionEvent) -> {
            String value = JOptionPane.showInputDialog("Insira o valor do saque (0.0)");
            Main.currentAcc.withdraw(value);
        });

        btnDeposit.addActionListener((ActionEvent) -> {
            String value = JOptionPane.showInputDialog("Insira o valor do depósito (0.0)");
            Main.currentAcc.deposit(value);
        });
    }
}