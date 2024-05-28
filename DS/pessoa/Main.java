import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa auxPessoa;
        String auxString = "";
        int auxInt;

        for (int i = 0; i < 4; i++) {
            do {
                auxString = JOptionPane.showInputDialog("1 - Pessoa Física\n2 - Pessoa Jurídica");
            } while (!MyInt.tryParse(auxString));

            auxInt = Integer.parseInt(auxString);

            switch (auxInt) {
                case 1:
                    pessoas.add(new Fisica());
                    auxPessoa = pessoas.get(i);
                    auxPessoa.setNome(JOptionPane.showInputDialog("Insira o seu nome"));
                    auxPessoa.setEndereco(JOptionPane.showInputDialog("Insira o seu endereço"));
                    ((Fisica) auxPessoa).setCpf(JOptionPane.showInputDialog("Insira o seu CPF"));
                    break;

                case 2:
                    pessoas.add(new Juridica());
                    auxPessoa = pessoas.get(i);
                    auxPessoa.setNome(JOptionPane.showInputDialog("Insira o seu nome"));
                    auxPessoa.setEndereco(JOptionPane.showInputDialog("Insira o seu endereço"));
                    ((Juridica) auxPessoa).setCnpj(JOptionPane.showInputDialog("Insira o seu CNPJ"));
                    break;
            
                default:
                    i--;
                    break;
            }
        }

        auxString = "";

        for (int i = 0; i < pessoas.size(); i++) {
            auxPessoa = pessoas.get(i);
            auxString += String.format("Pessoa %d\n", i+1);
            auxString += "Nome = "+auxPessoa.getNome()+"\n";
            auxString += "Endereço = "+auxPessoa.getEndereco()+"\n";

            if (auxPessoa instanceof Fisica) auxString += "CPF = "+((Fisica) auxPessoa).getCpf()+"\n\n";
            else auxString += "CPF = "+((Juridica) auxPessoa).getCnpj()+"\n\n";
        }

        System.out.print(auxString);
    }
}
