public class Fisica extends Pessoa{

    private String cpf;

    Fisica() {
        super();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public static boolean checkCpf(String cpf) { //inferno (mas funciona)
        char auxChar;
        int auxInt = 0;

        if (cpf.length() != 11 || MyInt.tryParse(cpf)) return false; //simples

        for (int i = 0; i < 9; i++) auxInt += (cpf.charAt(i) - '0') * (10 - i); //gera o numero grandão do coiso

        auxInt = 11 - auxInt % 11; //faz a conversão
        
        if (auxInt > 9) auxChar = '0'; //checa para > 10
        else auxChar = (char) (auxInt + 48);
        
        if (cpf.charAt(9) != auxChar) return false; //checa o digito verificador 1

        auxInt = 0; //meio que mesma coisa para o segundo depois disso VVVVVV

        for (int i = 0; i < 10; i++) auxInt += (cpf.charAt(i) - '0') * (11 - i);
        
        auxInt = 11 - auxInt % 11;
        
        if (auxInt > 9) auxChar = '0';
        else auxChar = (char) (auxInt + 48);

        if (cpf.charAt(10) != auxChar) return false;
        
        return true;
    } 
}
