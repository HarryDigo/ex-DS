//Feito por Rodrigo Scatolin Flora do Rio, rodrigo.scatolin.rio@gmail.com ou rodrigo.rio@etec.sp.gov.br
import java.util.Random;
import java.util.Scanner;

public class preda {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        System.out.print ("Pedra(0), Papel(1) ou Tesoura(2)");
        int n = input.nextInt();
        int n2 = gen.nextInt() % 3;
        switch(n) {
            case 0:
                if (n == n2) System.out.print("Empate!");
                else if (n2 == 1) System.out.print("Você perdeu");
                else System.out.print("Você venceu");
                break;
            case 1:
                if (n == n2) System.out.print("Empate!");
                else if (n2 == 2) System.out.print("Você perdeu");
                else System.out.print("Você venceu");
                break;
            case 2:
                if (n == n2) System.out.print("Empate!");
                else if (n2 == 0) System.out.print("Você perdeu");
                else System.out.print("Você venceu");
            break;
            default:
                System.out.print ("número inválido");
                break;
        }
        input.close();
    }
}