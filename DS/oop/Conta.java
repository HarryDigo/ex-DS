import javax.swing.JOptionPane;

public class Conta {
    private String cliente;
    private double saldo;

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    } 

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transacao(String tipo, double valor) {
        if (tipo == "saque") {
            valor = -valor;
        }

        if (saldo + valor < 0) {
            JOptionPane.showMessageDialog(null, cliente+"\n\nSeu saldo é insuficiente para esta transação");
            return;
        }

        saldo += valor;
    }
}