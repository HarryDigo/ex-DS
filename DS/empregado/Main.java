import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        Empregado auxEmpregado;

        Object[] opcoes = {"Assalariado", "Comissionado", "Horista", "Sair"};

        JTextField nome = new JTextField();
        JTextField sobrenome = new JTextField();
        JTextField cpf = new JTextField();
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JComponent[] inputs = new JComponent[] {
            new JLabel("Nome:"),
            nome,
            new JLabel("Sobrenome:"),
            sobrenome,
            new JLabel("CPF:"),
            cpf,
            null,
            text1,
            null,
            null,
        };

        while (true) {
            nome.setText("");
            sobrenome.setText("");
            cpf.setText("");
            text1.setText("");
            text2.setText("");

            Object selecao = JOptionPane.showInputDialog(null, "Selecione o tipo de empregado", null, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (selecao.toString()) {
                case "Assalariado":
                    inputs[8] = null;
                    inputs[9] = null;
                    inputs[6] = new JLabel("Salário:");
                    JOptionPane.showConfirmDialog(null, inputs);

                    empregados.add(new Assalariado(nome.getText(), sobrenome.getText(), cpf.getText()));
                    auxEmpregado = empregados.get(empregados.size()-1);

                    ((Assalariado) auxEmpregado).setSalario(Double.parseDouble(text1.getText()));

                    JOptionPane.showMessageDialog(null, String.format("Vencimento: R$%.2f.", auxEmpregado.vencimento()));
                    break;
            
                case "Comissionado":
                    inputs[6] = new JLabel("Total de vendas:");
                    inputs[8] = new JLabel("Taxa de comissão (%):");
                    inputs[9] = text2;
                    JOptionPane.showConfirmDialog(null, inputs);

                    empregados.add(new Comissionado(nome.getText(), sobrenome.getText(), cpf.getText()));
                    auxEmpregado = empregados.get(empregados.size()-1);

                    ((Comissionado) auxEmpregado).setTotalVenda(Double.parseDouble(text1.getText()));
                    ((Comissionado) auxEmpregado).setTaxaComissao(Double.parseDouble(text2.getText())/100);
                    
                    JOptionPane.showMessageDialog(null, String.format("Vencimento: R$%.2f.", auxEmpregado.vencimento()));
                    break;
            
                    case "Horista":
                        inputs[6] = new JLabel("Dinheiro por hora:");
                        inputs[8] = new JLabel("Horas Trabalhadas:");
                        inputs[9] = text2;
                        JOptionPane.showConfirmDialog(null, inputs);
    
                        empregados.add(new Horista(nome.getText(), sobrenome.getText(), cpf.getText()));
                        auxEmpregado = empregados.get(empregados.size()-1);
    
                        ((Horista) auxEmpregado).setPrecoHora(Double.parseDouble(text1.getText()));
                        ((Horista) auxEmpregado).setHorasTrabalhadas(Double.parseDouble(text2.getText()));
                        
                        JOptionPane.showMessageDialog(null, String.format("Vencimento: R$%.2f.", auxEmpregado.vencimento()));
                        break;

                    case "Sair": return;
            }
        }
    }
}