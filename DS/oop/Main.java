import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static Random rand = new Random();

    public static ArrayList<Conta> contas = new ArrayList<Conta>();

    public static void main(String[] args) {
        String auxString;
        int op;
        double valor;
        double limite;
        criarConta();

        outer:
        while (true) {
            do {
                auxString = JOptionPane.showInputDialog(conta.getNome()+"\nConta "+conta.getTipo()+"\n\nSelecione a operação:\n1 - depósito\n2 - saque\n3 - exibir saldo\n4 - mudar nome\n5 - exibir limite\n6 - mudar limite\n0 - sair");
            } while(!MyInt.tryParse(auxString));

            op = Integer.parseInt(auxString);

            switch (op) {
                case 0: break outer;

                case 1:
                    do {
                        auxString = JOptionPane.showInputDialog(conta.getNome()+"\nConta "+conta.getTipo()+"\n\nInsira o valor do depósito");
                    } while (!MyDouble.tryParse(auxString));

                    valor = Double.parseDouble(auxString);

                    conta.transacao("deposito", valor);
                    break;
                
                case 2:
                    do {
                        auxString = JOptionPane.showInputDialog(conta.getNome()+"\nConta "+conta.getTipo()+"\n\nInsira o valor do saque");
                    } while (!MyDouble.tryParse(auxString));

                    valor = Double.parseDouble(auxString);

                    conta.transacao("saque", valor);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, String.format("%s\nConta %s\n\nSeu saldo atual é: R$%.2f", conta.getNome(), conta.getTipo(), conta.getSaldo()));
                    break;

                case 4:
                    nome = JOptionPane.showInputDialog(conta.getNome()+"\nConta "+conta.getTipo()+"\n\nInsira o novo nome da conta");
                    conta.setNome(nome);
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, String.format("%s\nConta %s\n\nSeu limite atual é: R$%.2f", conta.getNome(), conta.getTipo(), conta.getLimite()));
                    break;

                case 6:
                    do {
                        auxString = JOptionPane.showInputDialog(String.format("%s\nConta %s\n\nSeu limite atual é: R$%.2f\n\nInsira o novo limite da conta", conta.getNome(), conta.getTipo(), conta.getLimite()));
                    } while (!MyDouble.tryParse(auxString));

                    limite = Double.parseDouble(auxString);
                    
                    conta.setLimite(limite);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, conta.getNome()+"\nConta "+conta.getTipo()+"\n\nOperação inválida, tente novamente");
                    break;
            }
        }
    }
    public static void criarConta() {
        String auxString;
        int auxInt;
        
        Conta conta = new Conta();

        do {
            do {
                auxString = JOptionPane.showInputDialog("Selecione o tipo de conta:\n1 - corrente\n2 - poupança");
            } while(!MyInt.tryParse(auxString));
            
            auxInt = Integer.parseInt(auxString);
        } while (!conta.setTipo(auxInt));

        String nome = JOptionPane.showInputDialog("Insira o seu nome");

        conta.setNome(nome);

        String senha = JOptionPane.showInputDialog("Insira a sua senha");

        conta.setSenha(senha);

        do {
            auxString = JOptionPane.showInputDialog("Insira o saldo inicial");
        } while(!MyDouble.tryParse(auxString));

        double saldo = Double.parseDouble(auxString);

        conta.setSaldo(saldo);

        do {
            auxString = JOptionPane.showInputDialog("Insira o limite da conta");
        } while(!MyDouble.tryParse(auxString));

        double limite = Double.parseDouble(auxString);

        conta.setLimite(limite);

        Conta.qtdConta++;

        outer:
        while (true) {
            do {
                auxString = JOptionPane.showInputDialog(String.format("Informações da conta:\nTipo de conta: %s\nId: %s\n Senha:\nSaldo inicial: R$%.2f\n Limite R$%.2f\n\nEstá tudo correto?\n1 - Sim\n2 - Não", conta.getTipo(), conta.getId(), conta.getSaldo(), conta.getLimite()));
            } while (!MyInt.tryParse(auxString));

            auxInt = Integer.parseInt(auxString);
            switch (auxInt) {
                case 1:
                    Conta.ids.remove(Conta.ids.size() - 1);
                    conta = null;
                    break outer;
            
                case 2:
                    contas.add(conta);
                    break outer;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
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