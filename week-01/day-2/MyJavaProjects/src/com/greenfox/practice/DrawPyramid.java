package com.greenfox.practice;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        // Írj egy programot, ami egy számot kér a standard input-ból és egy
        // ilyen piramist rajzol:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // A piramisnak annyi sora legyen,
        // mint amennyi az inputból kiolvasott szám értéke

        int lineCount;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy számot: ");
        lineCount = scanner.nextInt();

        for (int i = 0; i < lineCount; i++) {

            for (int k = 0; k < lineCount - (i + 1); k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 1 + (i * 2); j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
