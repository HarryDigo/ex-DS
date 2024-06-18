public class Main {
    public static void main(String[] args) {
        Horista e1 = new Horista("rodrigo", "rio", "2");
        e1.setPrecoHora(50);
        e1.setHorasTrabalhadas(2.5);

        Assalariado e2 = new Assalariado("guys", "galadiador", "69");
        e2.setSalario(69420);

        Comissionado e3 = new Comissionado("guerra", "godoy", "8");
        e3.setTotalVenda(1000000);
        e3.setTaxaComissao(0.002);

        System.out.printf("%s %s: R$%.2f\n%s %s: R$%.2f\n%s %s: R$%.2f\n", e1.getNome(), e1.getSobrenome(), e1.vencimento(), e2.getNome(), e2.getSobrenome(), e2.vencimento(), e3.getNome(), e3.getSobrenome(), e3.vencimento());
    }
}