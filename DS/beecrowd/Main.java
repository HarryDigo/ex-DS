package beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

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
                Coordenada player = new Coordenada(aux.indexOf("P", 1), i);
            }
        }
        
        //player.getCoords();

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

class Coordenada {
    public int x, y;

    Coordenada(int x,int y) {
        System.out.println("funciona");
        this.x = x;
        this.y = y;
    }

    public void getCoords() {
        System.out.printf("%d %d", x + 1, y + 1);
    }
}
/*
7 4
#######
#P.GTG#
#..TGG#
#######

8 6
########
#...GTG#
#..PG.G#
#...G#G#
#..TG.G#
########
 */