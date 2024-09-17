import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Search extends JFrame {
    private final JComboBox<Object> combo;
    private final JLabel lblModel, lblBrand, lblCat, lblAc, lblRadio, lblMulti;
    private final JButton btnDel, btnBack;
    private final JPanel panelBtn, panelTxt;

    public Search() {
        super("Registros | Cadastro de carros");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        combo = new JComboBox<>();

        panelTxt = new JPanel();
        panelTxt.setLayout(new GridLayout(6, 1));
        panelTxt.setBorder(new EmptyBorder(10, 10, 0, 10));

        lblModel = new JLabel("Modelo:");
        lblBrand = new JLabel("Modelo:");
        lblCat = new JLabel("Modelo:");
        lblAc = new JLabel("Ar Condicionado:");
        lblRadio = new JLabel("Rádio:");
        lblMulti = new JLabel("Multimídia:");

        panelTxt.add(lblModel);
        panelTxt.add(lblBrand);
        panelTxt.add(lblCat);
        panelTxt.add(lblAc);
        panelTxt.add(lblRadio);
        panelTxt.add(lblMulti);

        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBtn.setBorder(new EmptyBorder(10, 10, 10, 10));

        btnDel = new JButton("Remover registro");
        btnBack = new JButton("Voltar");

        panelBtn.add(btnDel);
        panelBtn.add(btnBack);

        Container window;
        window = getContentPane();
        window.setLayout(new BorderLayout());

        window.add(combo, BorderLayout.NORTH);
        window.add(panelTxt, BorderLayout.CENTER);
        window.add(panelBtn, BorderLayout.SOUTH);

        pack();

        btnBack.addActionListener((actionEvent) -> {
            this.dispose();
            Main.menu.setVisible(true);
        });
    }
}
