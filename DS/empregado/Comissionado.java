public class Comissionado extends Empregado {
    private double totalVenda;
    private double taxaComissao;

    Comissionado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public double vencimento() {
        return totalVenda * taxaComissao;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
}