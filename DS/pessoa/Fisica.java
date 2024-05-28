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

    public boolean checkCpf(String cpf) {
        char auxChar;
        int auxInt = 0;

        if (cpf.length() != 11) return false;

        for (int i = 0; i < 9; i++) {
            auxInt += cpf.charAt(i) * (10-i);
        }

        if (auxInt == 10) {};

        System.out.print(auxInt);



        return true;
    } 
}
