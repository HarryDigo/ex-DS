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
        ArrayList<int[]> coords = new ArrayList<int[]>();
        int[] auxCoords;

        for (int i = 0; i < h; i++) {
            aux = input.next();
            arr[i] = aux.toCharArray();
            if (aux.contains("P")) {
                pX = aux.indexOf("P", 1);
                pY = i;
            }
        }

        coords.add(new int[]{pX, pY});

        for (int i = -1; i < 2; i += 2) coords.add(new int[]{pX + i, pY});
        for (int i = -1; i < 2; i += 2) coords.add(new int[]{pX, pY + i});

        for (int i = 1; i < coords.size(); i++) {
            auxCoords = coords.get(i);
            switch (arr[auxCoords[0]][auxCoords[1]]) {
                case '#':
                    coords.remove(coords.get(i));
                    break;
            
                default:
                    break;
            }
        }
        
        for (int i = 0; i < coords.size(); i++) System.out.println(Arrays.toString(coords.get(i)));
        System.out.println(coords.indexOf(coords.get(1)));

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