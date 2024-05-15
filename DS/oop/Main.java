import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static Random rand = new Random();

    public static ArrayList<Conta> contas = new ArrayList<Conta>();

    public static void main(String[] args) {
        String auxString;
        int auxInt;
        double auxDouble;
        Conta conta, auxConta;

        while (true) {
            outer:
            while (true) {
                do {
                    auxString = JOptionPane.showInputDialog("Selecione a ação:\n1 - login\n2 - criar conta\n0 - sair");
                } while(!MyInt.tryParse(auxString));

                auxInt = Integer.parseInt(auxString);

                switch (auxInt) {
                    case 0: return;

                    case 1:
                        auxString = JOptionPane.showInputDialog("Insira o id da conta");

                        if (Conta.ids.contains(auxString)) {
                            conta = contas.get(Conta.ids.indexOf(auxString));

                            auxString = JOptionPane.showInputDialog("Insira a senha desta conta");

                            if (auxString.equals(conta.getSenha())) break outer;

                            JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente.");
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Id incorreto ou inexistente, tente novamente");
                        break;

                    case 2:
                        criarConta();
                        break;
                
                    default:
                        JOptionPane.showMessageDialog(null, "Ação inválida, tente novamente");
                        break;
                }
            }

            outer:
            while (true) {
                do {
                    auxString = JOptionPane.showInputDialog(conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nSelecione a operação:\n1 - depósito\n2 - saque\n3 - transferência\n4 - exibir saldo\n5 - mudar nome\n6 - mudar senha\n7 - exibir limite\n8 - mudar limite\n0 - sair");
                } while(!MyInt.tryParse(auxString));

                auxInt = Integer.parseInt(auxString);

                switch (auxInt) {
                    case 0: break outer;

                    case 1:
                        do {
                            auxString = JOptionPane.showInputDialog(conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nInsira o valor do depósito");
                        } while (!MyDouble.tryParse(auxString));

                        auxDouble = Double.parseDouble(auxString);

                        conta.transacao("deposito", auxDouble);
                        break;
                    
                    case 2:
                        do {
                            auxString = JOptionPane.showInputDialog(conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nInsira o valor do saque");
                        } while (!MyDouble.tryParse(auxString));

                        auxDouble = Double.parseDouble(auxString);

                        conta.transacao("saque", auxDouble);
                        break;

                    case 3:
                        auxString = JOptionPane.showInputDialog("Insira o id da conta alvo");

                        if (Conta.ids.contains(auxString) && !auxString.equals(conta.getId())) {
                            auxConta = contas.get(Conta.ids.indexOf(auxString));
                        } else {
                            JOptionPane.showMessageDialog(null, "Conta alvo inválida");
                            break;
                        }

                        do {
                            auxString = JOptionPane.showInputDialog(conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nInsira o valor da transferência");
                        } while (!MyDouble.tryParse(auxString));

                        auxDouble = Double.parseDouble(auxString);

                        if (conta.transacao("saque", auxDouble)) {
                            auxConta.transacao("deposito", auxDouble);
                        }
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, String.format("%s\nId: %s\nConta %s\n\nSeu saldo atual é: R$%.2f", conta.getNome(), conta.getId(), conta.getTipo(), conta.getSaldo()));
                        break;

                    case 5:
                        auxString = JOptionPane.showInputDialog(conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nInsira o novo nome da conta");
                        conta.setNome(auxString);
                        break;
                        
                    case 6:
                        auxString = JOptionPane.showInputDialog(conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nInsira a nova senha da conta");
                        conta.setSenha(auxString);
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, String.format("%s\nId: %s\nConta %s\n\nSeu limite atual é: R$%.2f", conta.getNome(), conta.getId(), conta.getTipo(), conta.getLimite()));
                        break;

                    case 8:
                        do {
                            auxString = JOptionPane.showInputDialog(String.format("%s\nId: %s\nConta %s\n\nSeu limite atual é: R$%.2f\n\nInsira o novo limite da conta", conta.getNome(), conta.getId(), conta.getTipo(), conta.getLimite()));
                        } while (!MyDouble.tryParse(auxString));

                        auxDouble = Double.parseDouble(auxString);
                        
                        conta.setLimite(auxDouble);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, conta.getNome()+"\nId: "+conta.getId()+"\nConta "+conta.getTipo()+"\n\nOperação inválida, tente novamente");
                        break;
                }
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
                auxString = JOptionPane.showInputDialog(String.format("Informações da conta:\nTipo de conta: %s\nId: %s\nSenha: %s\nSaldo inicial: R$%.2f\n Limite R$%.2f\n\nEstá tudo correto?\n1 - Sim\n2 - Não", conta.getTipo(), conta.getId(), conta.getSenha(), conta.getSaldo(), conta.getLimite()));
            } while (!MyInt.tryParse(auxString));

            auxInt = Integer.parseInt(auxString);
            switch (auxInt) {
                case 1:
                    contas.add(conta);
                    break outer;
            
                case 2:
                    Conta.ids.remove(Conta.ids.size() - 1);
                    conta = null;
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