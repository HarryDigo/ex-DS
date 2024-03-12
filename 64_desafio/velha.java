import java.util.Scanner;

public class velha {
    static void campo(char[][] arr) {
        for (int i = 0; i < 3; i++) {            
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main (String[] args) {
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {            
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '.';
            }
            System.out.println("");
        }
        Scanner input = new Scanner(System.in);
        int[] coord = new int[2];
        int[] n = new int[5]; //n[0] olha colunas, n[1] olha linhas, n[2] olha diagonais au, n[3] olha diagonais ua e n[4] olha turnos :)
        boolean end = false;
        char p = 'X';
        boolean proc = true;
        while (end == false) {
            campo(arr);
            do {
                System.out.printf("Jogador %c, Insira as coordenadas: ",p);
                coord[1] = input.nextInt() - 1;
                coord[0] = input.nextInt() - 1;
                if (coord[0] > 2 || coord[0] < 0 || coord[1] > 2 || coord[1] < 0) {
                    System.out.println("Coordenadas inválidas, tente novamente.");
                    proc = false;
                } else if (arr[coord[0]][coord[1]] != '.') {
                    System.out.println("Já foi escolhido, tente novamente.");
                    proc = false;
                } else {
                    arr[coord[0]][coord[1]] = p;
                    proc = true;
                }
            } while (proc == false);
            for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) {
                if (arr[coord[i]][coord[j]] == p) n[0]++;
                if (arr[coord[j]][coord[i]] == p) n[1]++;
                if (j == i) if (arr[coord[i]][coord[j]] == p) n[2]++;
                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) if (arr[coord[i]][coord[j]] == p) n[3]++;
            }
            for (int i = 0; i < 4; i++) if (n[i] == 3) {
                System.out.printf("Jogador %c venceu com este campo:", p);
                campo(arr);
            }
        }
        input.close();
    }
}

