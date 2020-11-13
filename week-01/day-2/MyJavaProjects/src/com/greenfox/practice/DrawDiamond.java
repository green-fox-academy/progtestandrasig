package com.greenfox.practice;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        // Írj egy programot, ami egy számot kér a standard input-ból és egy
        // ilyen rombuszt rajzol:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // A rombusznak annyi sora legyen,
        // mint amennyi az inputból kiolvasott szám értéke

        int lineCount;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy számot: ");
        lineCount = scanner.nextInt();

        for (int i = 0; i < lineCount / 2; i++) {

            for (int k = 0; k < (lineCount / 2) - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 1 + (i * 2); j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        if (lineCount / 2 == 1) {

            for (int i = 0; i < lineCount * 2 + 1; i++) {

                System.out.print("*");
            }
        }

        for (int i = lineCount / 2; i >= 0; i--) {

            if (lineCount % 2 == 0 && i == lineCount / 2)
                continue;

            for (int k = (lineCount / 2) - i; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = 1 + (i * 2); j > 0; j--) {

                if (j == lineCount / 2 && i >= lineCount / 2)
                    System.out.print("×");
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}
