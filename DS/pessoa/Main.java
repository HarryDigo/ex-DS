import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa auxPessoa;
        String auxString = "";
        int auxInt;

        do {
            auxString = JOptionPane.showInputDialog("Quantas pessoas você gostaria de criar?");
        } while (!MyInt.tryParse(auxString)); 

        auxInt = Integer.parseInt(auxString);

        for (int i = 0; i < auxInt; i++) {
            do {
                auxString = JOptionPane.showInputDialog(String.format("Pessoa %d\n\n1 - Pessoa Física\n2 - Pessoa Jurídica", i+1));
            } while (!MyInt.tryParse(auxString)); 

            auxInt = Integer.parseInt(auxString);

            switch (auxInt) {
                case 1:
                    pessoas.add(new Fisica());
                    auxPessoa = pessoas.get(i);
                    auxPessoa.setNome(JOptionPane.showInputDialog("Insira o seu nome"));
                    auxPessoa.setEndereco(JOptionPane.showInputDialog("Insira o seu endereço"));

                    do {
                        auxString = JOptionPane.showInputDialog("Insira o seu CPF");
                        JOptionPane.showMessageDialog(null, auxString);
                        if (!Fisica.checkCpf(auxString)) JOptionPane.showMessageDialog(null, "CPF inválido, tente novamente");
                    } while (!Fisica.checkCpf(auxString));
                    ((Fisica) auxPessoa).setCpf(auxString);

                    break;

                case 2:
                    pessoas.add(new Juridica());
                    auxPessoa = pessoas.get(i);
                    auxPessoa.setNome(JOptionPane.showInputDialog("Insira o seu nome"));
                    auxPessoa.setEndereco(JOptionPane.showInputDialog("Insira o seu endereço"));

                    do {
                        auxString = JOptionPane.showInputDialog("Insira o seu CNPJ");
                        if (!Juridica.checkCnpj(auxString)) JOptionPane.showMessageDialog(null, "CNPJ inválido, tente novamente");
                    } while (!Juridica.checkCnpj(auxString));
                    ((Juridica) auxPessoa).setCnpj(auxString);

                    break;
            
                default:
                    i--;

                    break;
            }
        }

        auxString = "";

        for (int i = 0; i < pessoas.size(); i++) {
            auxPessoa = pessoas.get(i);
            auxString += String.format("Pessoa %d (%s)\n", i+1, auxPessoa.getClass());
            auxString += "Nome = "+auxPessoa.getNome()+"\n";
            auxString += "Endereço = "+auxPessoa.getEndereco()+"\n";

            if (auxPessoa instanceof Fisica) auxString += "CPF = "+((Fisica) auxPessoa).getCpf()+"\n\n";
            else auxString += "CNPJ = "+((Juridica) auxPessoa).getCnpj()+"\n\n";
        }

        System.out.print(auxString);
    }
}
