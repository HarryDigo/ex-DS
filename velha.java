import java.util.Scanner;

public class velha {
    public static void main (String[] args) {
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {            
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '.';
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        Scanner input = new Scanner(System.in);
        int[] coord = new int[2];
        boolean end = false;
        while (end == false) {
            for (int i = 0; i < 3; i++) {            
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
