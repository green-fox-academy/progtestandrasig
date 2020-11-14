package com.greenfox.practice.day3;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Készíts (dinamikusan*) egy kétdimenziós tömböt
        //   a következő mátrix-szal**. Ciklust (loop-ot) használj!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Írasd ki a konzolra ezt a kétdimenziós tömböt
        // * A tömb hossza egy változótól kell függjön
        // ** Nyugalom, egy mátrix pont olyan, mint egy tömb

        System.out.print("Add meg a mátrix hosszát (2-127): ");
        Scanner scanner = new Scanner(System.in);
        byte length =  scanner.nextByte();

        byte[][] matrix = new byte[length][length];

        //Feltöltés:
        //int index = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                //if (j != index) matrix[i][j] = 0;     //Ezzel a megoldással is működik!
                if (i != j) matrix[i][j] = 0;
                else matrix[i][j] = 1;
            }
            //index++;
        }

        //Kiíratás:
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}