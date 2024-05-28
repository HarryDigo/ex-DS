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

    public static boolean checkCnpj(String cnpj) { //inferno (mas funciona)
        char auxChar;
        int auxInt = 0;

        if (cnpj.length() != 14 || MyInt.tryParse(cnpj)) return false; //simples

        for (int i = 0; i < 12; i++) auxInt += (cnpj.charAt(11 - i) - '0') * (2 + i % 8); //gera o numero grandão do coiso

        auxInt = 11 - auxInt % 11; //faz a conversão
        
        if (auxInt > 9) auxChar = '0'; //checa para > 10
        else auxChar = (char) (auxInt + 48);
        
        if (cnpj.charAt(12) != auxChar) return false; //checa o digito verificador 1

        auxInt = 0; //meio que mesma coisa para o segundo depois disso VVVVVV

        for (int i = 0; i < 13; i++) auxInt += (cnpj.charAt(12 - i) - '0') * (2 + i % 8);
        
        auxInt = 11 - auxInt % 11;
        
        if (auxInt > 9) auxChar = '0';
        else auxChar = (char) (auxInt + 48);

        if (cnpj.charAt(13) != auxChar) return false;
        
        return true;
    }
}
