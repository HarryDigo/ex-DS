import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainMenu extends JFrame {
    private final JTextField txtModel, txtBrand;
    private final JRadioButton radioSedan, radioSuv, radioHatch;
    private final ButtonGroup radioGroup;
    private final JCheckBox checkAc, checkRadio, checkMulti;
    private final JButton btnCreate, btnSearch;
    private final JLabel lblModel, lblBrand, lblCat, lblOpt;
    private final JPanel panelTxt, panelCat, panelOpt, panelBtn;

    public MainMenu() {
        super("Menu Principal | Cadastro de carros");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelTxt = new JPanel();
        panelTxt.setLayout(new GridLayout(4, 1));
        panelTxt.setBorder(new EmptyBorder(10, 10, 0 ,10));

        txtModel = new JTextField(15);
        txtBrand = new JTextField(15);
        lblModel = new JLabel("Modelo:");
        lblBrand = new JLabel("Marca:");

        panelTxt.add(lblModel);
        panelTxt.add(txtModel);
        panelTxt.add(lblBrand);
        panelTxt.add(txtBrand);

        panelCat = new JPanel();
        panelCat.setLayout(new GridLayout(4, 1));
        panelCat.setBorder(new EmptyBorder(10, 10, 0 ,10));

        radioSedan = new JRadioButton("Sedan", true);
        radioSuv = new JRadioButton("SUV", false);
        radioHatch = new JRadioButton("Hatch", false);
        lblCat = new JLabel("Categoria:");

        radioGroup = new ButtonGroup();
        radioGroup.add(radioSedan);
        radioGroup.add(radioSuv);
        radioGroup.add(radioHatch);

        panelCat.add(lblCat);
        panelCat.add(radioSedan);
        panelCat.add(radioSuv);
        panelCat.add(radioHatch);

        panelOpt = new JPanel();
        panelOpt.setLayout(new GridLayout(4, 1));
        panelOpt.setBorder(new EmptyBorder(10, 10, 0 ,10));

        checkAc = new JCheckBox("Ar Condicionado");
        checkRadio = new JCheckBox("Rádio");
        checkMulti = new JCheckBox("Multimídia");
        lblOpt = new JLabel("Opcionais:");

        panelOpt.add(lblOpt);
        panelOpt.add(checkAc);
        panelOpt.add(checkRadio);
        panelOpt.add(checkMulti);

        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBtn.setBorder(new EmptyBorder(10, 0, 10, 0));

        btnCreate = new JButton("Criar registro");
        btnSearch = new JButton("Pesquisa de registros");

        panelBtn.add(btnCreate);
        panelBtn.add(btnSearch);

        Container window;
        window = getContentPane();
        window.setLayout(new BorderLayout());

        window.add(panelTxt, BorderLayout.WEST);
        window.add(panelCat, BorderLayout.CENTER);
        window.add(panelOpt, BorderLayout.EAST);
        window.add(panelBtn, BorderLayout.SOUTH);

        pack();

        btnCreate.addActionListener((actionEvent) -> {
            if (txtModel.getText().isBlank() || txtBrand.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Insira valores válidos");
                return;
            } else if (Car.names.contains(txtBrand.getText()+" "+txtModel.getText())) {
                JOptionPane.showMessageDialog(this, "Este registro já existe");
                return;
            }

            String cat;

            if (radioSedan.isSelected()) cat = "Sedan";
            else if (radioSuv.isSelected()) cat = "SUV";
            else cat = "Hatch";

            Main.currentCar = new Car(txtModel.getText(), txtBrand.getText(), cat, checkAc.isSelected(), checkRadio.isSelected(), checkMulti.isSelected());
            Main.cars.add(Main.currentCar);
        });

        btnSearch.addActionListener((actionEvent) -> {
            if (Main.cars.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum registro presente");
                return;
            }

            this.dispose();
            Main.search.updateCombo();
            Main.search.setVisible(true);
        });
    }
}