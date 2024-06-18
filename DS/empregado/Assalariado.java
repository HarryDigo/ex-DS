public class Assalariado extends Empregado {
    private double salario;

    Assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }
    
    public double vencimento() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
