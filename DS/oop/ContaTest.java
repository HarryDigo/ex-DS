import javax.swing.JOptionPane;

public class ContaTest {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira o seu nome");
        String aux;
        double valor;
        int op;

        do {
            aux = JOptionPane.showInputDialog(nome+"\n\nInsira o saldo inicial");
        } while(!MyDouble.tryParse(aux));

        double saldo = Double.parseDouble(aux);

        Conta conta1 = new Conta(nome, saldo);

        while (true) {
            do {
                aux = JOptionPane.showInputDialog(conta1.getCliente()+"\n\nSelecione a operação:\n1 - depósito\n2 - saque\n3 - exibir saldo\n4 - mudar nome\n0 - sair");
            } while(!MyInt.tryParse(aux));

            op = Integer.parseInt(aux);

            switch (op) {
                case 0: return;

                case 1:
                    do {
                        aux = JOptionPane.showInputDialog(conta1.getCliente()+"\n\nInsira o valor do depósito");
                    } while (!MyDouble.tryParse(aux));

                    valor = Double.parseDouble(aux);

                    conta1.transacao("deposito", valor);
                    break;
                
                case 2:
                    do {
                        aux = JOptionPane.showInputDialog(conta1.getCliente()+"\n\nInsira o valor do saque");
                    } while (!MyDouble.tryParse(aux));

                    valor = Double.parseDouble(aux);

                    conta1.transacao("saque", valor);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, String.format("%s\n\nSeu saldo atual é: R$%.2f", conta1.getCliente(), conta1.getSaldo()));
                    break;

                case 4:
                    nome = JOptionPane.showInputDialog(conta1.getCliente()+"\n\nInsira o novo nome da conta");
                    conta1.setCliente(nome);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, conta1.getCliente()+"\n\nOperação inválida, tente novamente");
                    break;
            }
        }
    }
}

class MyDouble {
    public static boolean tryParse(String num) {
        try {
            Double.parseDouble(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

class MyInt {
    public static boolean tryParse(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}