import javax.swing.JOptionPane;

public class Conta {
    private String cliente;
    private String tipo;
    private double saldo;
    private double limite;

    public Conta(String cliente, double saldo, double limite) {
        this.cliente = cliente;
        this.saldo = saldo;
        setLimite(limite);
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

    public void transacao(String tipo, double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente;");
            return;
        }

        if (tipo == "saque") {
            valor = -valor;
        } else if (this.tipo == "poupanca") {
            valor *= 1.0005;
        }

        if (saldo + valor < limite) {
            JOptionPane.showMessageDialog(null, cliente+"\nConta "+tipo+"\n\nSeu saldo é insuficiente para esta transação");
            return;
        }

        saldo += valor;
    }
}