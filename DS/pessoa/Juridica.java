public class Juridica extends Pessoa{
    
    private String cnpj;

    Juridica() {
        super();
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }
}
