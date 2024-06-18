public class Horista extends Empregado {
    private double precoHora;
    private double horasTrabalhadas;

    Horista(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public double vencimento() {
        return precoHora * horasTrabalhadas;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
