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
        combo.setBorder(new EmptyBorder(10, 10, 10, 10));

        panelTxt = new JPanel();
        panelTxt.setLayout(new GridLayout(6, 1));
        panelTxt.setBorder(new EmptyBorder(0, 10, 10, 10));

        lblModel = new JLabel("Modelo:");
        lblBrand = new JLabel("Marca:");
        lblCat = new JLabel("Categoria:");
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
        panelBtn.setBorder(new EmptyBorder(0, 10, 10, 10));

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

        combo.addActionListener((actionEvent) -> {
            String item = (String) combo.getSelectedItem();
            int auxIndex = 0;

            if (Car.names.contains(item)) {
                auxIndex = Car.names.indexOf(item);
                System.out.println("AAAAAA");
            }

            Main.currentCar = Main.cars.get(auxIndex);
            updateText();
        });

        btnDel.addActionListener((actionEvent) -> {
            if (Main.cars.size() == 1) {
                JOptionPane.showMessageDialog(this, "Existe apenas um registro");
                return;
            }
            Car.names.remove(Main.cars.indexOf(Main.currentCar));
            Main.cars.remove(Main.cars.indexOf(Main.currentCar));
            Main.currentCar = Main.cars.get(0);
            updateCombo();
        });
    }

    public void updateCombo() {
        combo.removeAllItems();

        combo.addItem(Main.currentCar.getName());
        for (String name : Car.names) {
            if (!name.equals(Main.currentCar.getName())) combo.addItem(name);
        }
    }

    private void updateText() {
        Car auxCar = Main.currentCar;

        lblModel.setText("Modelo: "+auxCar.getModel());
        lblBrand.setText("Marca: "+auxCar.getBrand());
        lblCat.setText("Categoria: "+auxCar.getCat());
        if (auxCar.getAc()) lblAc.setText("Ar condicionado: Sim");
        else lblAc.setText("Ar condicionado: Não");
        if (auxCar.getRadio()) lblRadio.setText("Rádio: Sim");
        else lblRadio.setText("Rádio: Não");
        if (auxCar.getMulti()) lblMulti.setText("Multimídia: Sim");
        else lblMulti.setText("Multimídia: Não");
    }
}
