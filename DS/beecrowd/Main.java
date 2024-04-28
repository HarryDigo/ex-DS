package beecrowd;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();
        char arr[][] = new char[w][h];
        String aux;
        int pX = 0, pY = 0;

        for (int i = 0; i < h; i++) {
            aux = input.next();
            arr[i] = aux.toCharArray();
            if (aux.contains("P")) {
                pX = aux.indexOf("P", 1);
                pY = i;
            }
        }
        
        System.out.println();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.printf("P: %d %d", pX + 1, pY + 1);

        input.close();
    }
}