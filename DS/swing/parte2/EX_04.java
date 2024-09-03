import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

public class EX_04 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JTextArea txtArea1, txtArea2;
    private final JButton btn;

    EX_04() {
        super("TextArea Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtArea1 = new JTextArea(15, 15);
        txtArea2 = new JTextArea(15, 15);
        btn = new JButton("Copy>>>");

        txtArea1.setLineWrap(true);

        txtArea2.setLineWrap(true);
        txtArea2.setEditable(false);

        Container janela;
        janela = getContentPane();
        janela.setLayout(new BorderLayout());

        janela.add(txtArea1, BorderLayout.WEST);
        janela.add(btn, BorderLayout.CENTER);
        janela.add(txtArea2, BorderLayout.EAST);

        btn.addActionListener((actionEvent) -> {
            txtArea2.setText(txtArea1.getText());
        });

        pack();
    }

    public static void main(String[] args) {
        EX_04 frame = new EX_04();
        frame.setVisible(true);
    }
}