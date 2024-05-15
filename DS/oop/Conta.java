import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Conta {
    public static ArrayList<String> ids = new ArrayList<String>();
    public static int qtdConta;

    private String id;
    private String tipo;
    private String nome;
    private String senha;
    private double limite;
    private double saldo;

    public Conta() {
        int auxInt = Main.rand.nextInt(99999999);
        String auxString = String.format("%08d",auxInt);

        while (ids.contains(auxString)) {
            auxInt = Main.rand.nextInt(99999999);
            auxString = String.format("%08d",auxInt);
        }

        id = auxString;
        ids.add(auxString);
        qtdConta++;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String cliente) {
        this.nome = cliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    } 

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite > 0) limite = -limite;

        if (limite > saldo) {
            JOptionPane.showMessageDialog(null, "Seu saldo está abaixo do novo limite, tente novamente");
            return;
        }

        this.limite = limite;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(int tipo) {
        switch (tipo) {
            case 1:
                this.tipo = "corrente";
                return true;

            case 2:
                this.tipo = "poupanca";
                return true;
        
            default:
                JOptionPane.showMessageDialog(null, "Tipo de conta inválido, tente novamente");
                return false;
        }
    }

    public boolean transacao(String tipo, double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente;");
            return false;
        }

        if (tipo == "saque") {
            valor = -valor;
        } else if (this.tipo == "poupanca") {
            valor *= 1.0005;
        }

        if (saldo + valor < limite) {
            JOptionPane.showMessageDialog(null, nome+"\nId: "+id+"\nConta "+this.tipo+"\n\nSeu saldo é insuficiente para esta transação");
            return false;
        }

        saldo += valor;
        return true;
    }
}