import java.util.Random;
import java.util.Scanner;

public class naval {
    static void campo(char[][][] arr) { //mostra arr a ser jogado/mostradoijasd
        System.out.print("   1 2 3 4 5 6 7 8 9 10"); //deixei esse bonitinho, como na vez do c
        for (int i = 0; i < 10; i++) {
            System.out.printf ("\n%d ",i + 1);
            if (i < 9) System.out.printf(" ");
            for (int j = 0; j<10; j++) System.out.printf("%c ",arr[0][j][i]);
        }
    }
    public static void main (String[] args) {
        int[] coord = new int[2];
        char[][][] arr = new char[3][10][10]; //ah é, aqui o arr[0] é o a ser mostrado o [1] são as minas corretas, e o [2] é um contadorpara só as suas acertadas, achei mais facil assim
        for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) {
            arr[0][i][j] = '.'; //populando arr a ser mostrado
        }
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) { //gerando 20 minas dos 100 coisos
            coord[0] = Math.floorMod(gen.nextInt(), 10);
            coord[1] = Math.floorMod(gen.nextInt(), 10);
            if (arr[1][coord[0]][coord[1]] == 'X') i--; //deixa as minas unicas se alguma repete
            arr[1][coord[0]][coord[1]] = 'X';
        }
        while (true) {
            campo(arr);
            System.out.printf ("\nDigite as coordenadas (Coloque coordenadas inválidas para sair): ");
            coord[0] = input.nextInt() - 1;
            coord[1] = input.nextInt() - 1;
            if (coord[0] < 0 || coord[0] > 10 || coord[1] < 0 || coord[1] > 10) {
                System.out.println("Esta era sua posição final:");
                campo(arr);
                System.out.printf("\nEstas eram as localizações das minas:\n");
                for (int i = 0; i<10; i++) for (int j = 0; j < 10; j++) { //trocando o campo mostrado pelas posiççoes corredfatas
                    if (arr[1][j][i] == 'X') arr[0][j][i] = 'X';
                    if (arr[0][j][i] == 'O') arr[0][j][i] = '.';
                }
                campo(arr);
                input.close();
                return;
            }
            if (arr[1][coord[0]][coord[1]] == 'X') { //colocando sua jogada no lugar
                arr[0][coord[0]][coord[1]] = 'X';
                arr[2][coord[0]][coord[1]] = 'X';
            } else arr[0][coord[0]][coord[1]] = 'O';
            if (arr[1] == arr[2]) { //checando se seus acertos são iguais aos certos
                System.out.print("Voce venceu! este era seu campo final:");
                campo(arr);
                input.close();
                return;
            }
        }
    }
}