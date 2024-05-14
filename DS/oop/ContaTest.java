import javax.swing.JOptionPane;

public class ContaTest {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira o seu nome");
        String aux;
        double valor;
        int op;
        int tipo;

        do {
            aux = JOptionPane.showInputDialog(nome+"\n\nInsira o saldo inicial");
        } while(!MyDouble.tryParse(aux));

        double saldo = Double.parseDouble(aux);

        do {
            aux = JOptionPane.showInputDialog(nome+"\n\nInsira o limite da conta");
        } while(!MyDouble.tryParse(aux));

        double limite = Double.parseDouble(aux);

        Conta conta1 = new Conta(nome, saldo, limite);

        do {
            do {
                aux = JOptionPane.showInputDialog(conta1.getCliente()+"\n\nSelecione o tipo de conta:\n1 - corrente\n2 - poupança");
            } while(!MyInt.tryParse(aux));
            
            tipo = Integer.parseInt(aux);
        } while (!conta1.setTipo(tipo));

        while (true) {
            do {
                aux = JOptionPane.showInputDialog(conta1.getCliente()+"\nConta "+conta1.getTipo()+"\n\nSelecione a operação:\n1 - depósito\n2 - saque\n3 - exibir saldo\n4 - mudar nome\n5 - exibir limite\n6 - mudar limite\n0 - sair");
            } while(!MyInt.tryParse(aux));

            op = Integer.parseInt(aux);

            switch (op) {
                case 0: return;

                case 1:
                    do {
                        aux = JOptionPane.showInputDialog(conta1.getCliente()+"\nConta "+conta1.getTipo()+"\n\nInsira o valor do depósito");
                    } while (!MyDouble.tryParse(aux));

                    valor = Double.parseDouble(aux);

                    conta1.transacao("deposito", valor);
                    break;
                
                case 2:
                    do {
                        aux = JOptionPane.showInputDialog(conta1.getCliente()+"\nConta "+conta1.getTipo()+"\n\nInsira o valor do saque");
                    } while (!MyDouble.tryParse(aux));

                    valor = Double.parseDouble(aux);

                    conta1.transacao("saque", valor);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, String.format("%s\nConta %s\n\nSeu saldo atual é: R$%.2f", conta1.getCliente(), conta1.getTipo(), conta1.getSaldo()));
                    break;

                case 4:
                    nome = JOptionPane.showInputDialog(conta1.getCliente()+"\nConta "+conta1.getTipo()+"\n\nInsira o novo nome da conta");
                    conta1.setCliente(nome);
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, String.format("%s\nConta %s\n\nSeu limite atual é: R$%.2f", conta1.getCliente(), conta1.getTipo(), conta1.getLimite()));
                    break;

                case 6:
                    do {
                        aux = JOptionPane.showInputDialog(String.format("%s\nConta %s\n\nSeu limite atual é: R$%.2f\n\nInsira o novo limite da conta", conta1.getCliente(), conta1.getTipo(), conta1.getLimite()));
                    } while (!MyDouble.tryParse(aux));

                    limite = Double.parseDouble(aux);
                    
                    conta1.setLimite(limite);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, conta1.getCliente()+"\nConta "+conta1.getTipo()+"\n\nOperação inválida, tente novamente");
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