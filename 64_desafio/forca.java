import java.util.Scanner;

public class forca {
    static void campo(char[] field, char[] err, int aux) {
        System.out.print("Erros (max. 6): ");
        for (int i = 0; i < 6; i++) System.out.printf("%c ", err[i]);
        System.out.println("");
        for (int i = 0; i < aux; i++) System.out.printf("%c ", field[i]); 
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a palavra correta: ");
        String word = input.nextLine();
        char[][] field = new char[2][word.length()];
        char[] err = new char[6];
        int aux = word.length();
        for (int i = 0; i < 6; i++) err[i] = '.';
        for (int i = 0; i < aux; i++) { //transfere a string para os caracteres e popula o campo mostrado
            field[0][i] = word.charAt(i);
            field[1][i] = '_';
        }
        campo(field[1], err, aux);
        while(true) {
            System.out.print("Digite uma letra: ");
            char p = input.next().charAt(0);
        }
    }
}