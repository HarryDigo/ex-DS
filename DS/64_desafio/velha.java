//Feito por Rodrigo Scatolin Flora do Rio, rodrigo.scatolin.rio@gmail.com ou rodrigo.rio@etec.sp.gov.br
import java.util.Scanner;

public class velha { //vi que esse tava bem confuso, então decidi esplicar umas lin ha
    static void campo(char[][] arr) { //só pega a matriz e mostra ela :)
        System.out.println("");
        for (int i = 0; i < 3; i++) {            
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main (String[] args) {
        char[][] arr = new char[3][3]; //cria u compoi vazio
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) arr[i][j] = '.';
        Scanner input = new Scanner(System.in);
        int[] coord = new int[2];
        int[] n = new int[5]; //n[0] olha colunas, n[1] olha linhas, n[2] olha diagonais au, n[3] olha diagonais ua e n[4] olha turnos :)
        char p = 'X'; // j0ogadore
        boolean proc = true; //proceder para a etapa de checagem ("ver se o turno é valido")
        while (true) {
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
            for (int i = 0; i < 3; i++) { //checagem e tudo
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] == p) n[0]++;
                    if (arr[j][i] == p) n[1]++;
                    if (j == i) if (arr[i][j] == p) n[2]++;
                    if ((i == 0 && j == 2) || (i == 1 && j == i) || (i == 2 && j == 0)) if (arr[i][j] == p) n[3]++;
                }
                for (int k = 0; k < 4; k++) if (n[k] == 3) { //quando vitória
                    System.out.printf("Jogador %c venceu com este campo:\n", p);
                    campo(arr);
                    input.close();
                    return;
                }
                n[0] = 0; //resetar col e linha entre passadas
                n[1] = 0;
            } //fim da checagem
            n[4]++;
            if (n[4] == 9) {
                System.out.print("Deu velha com este campo:\n");
                campo(arr);
                input.close();
                return;
            }
            for (int i = 0; i < 4; i++) n[i] = 0; //reseta valores de checagem
            if (p == 'X') p = 'O'; 
            else p = 'X';
        }
    }
}