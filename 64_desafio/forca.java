import java.util.Arrays;
import java.util.Scanner;

public class forca {
    static void campo(char[] field, char[] err, int aux) {
        System.out.print("Erros: ");
        for (int i = 0; i < 6; i++) System.out.printf("%c ", err[i]);
        System.out.println("");
        for (int i = 0; i < aux; i++) System.out.printf("%c ", field[i]); 
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a palavra correta: ");
        String word = input.nextLine();
        char[][] field = new char[2][word.length()]; //field 0 é a palavra certa, field 1 é o visual
        char[] err = new char[6];
        boolean sim = false;
        int aux = word.length();
        int aux2 = 0;
        for (int i = 0; i < 6; i++) err[i] = '.';
        for (int i = 0; i < aux; i++) { //transfere a string para os caracteres e popula o campo mostrado
            field[0][i] = word.charAt(i);
            field[1][i] = '_';
        }
        while(true) {
            campo(field[1], err, aux);
            System.out.print("Digite uma letra: ");
            char p = input.next().charAt(0);
            for (int i = 0; i < word.length(); i++) { //bla bla bla checagem
                if (field[0][i] == p) {
                    field[1][i] = p;
                    sim = true;
                }
            }
            if (aux2 == 6) { //defeat
                System.out.printf("Você perdeu!\nA palavra correta era \"%s\".", word);
                input.close();
                return;
            }
            if (sim != true) { //no caso de erro (não quis adicionar checagem de repitido pois preguiça e skill issue)
                err[aux2] = p;
                aux2++;
            }
            if (Arrays.equals(field[0], field[1])) { //victory
                campo(field[1], err, aux);
                System.out.printf("\nParabéns, você venceu!");
                input.close();
                return;
            }
            sim = false;
        }
    }
}