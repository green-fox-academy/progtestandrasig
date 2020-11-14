package com.greenfox.practice.day3;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból és egy
        // ilyen négyzetet rajzol::
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // A négyzetnek annyi sora legyen,
        // mint amennyi az inputból kiolvasott szám értéke

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem adjon meg egy számot: ");
        int lineCount = scanner.nextInt();

        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
        }
        System.out.println();

        int index = 0;
        for (int i = 0; i < lineCount - 2; i++) {
            System.out.print("%");
            for (int j = 0; j < lineCount - 2; j++) {
                if (j == index)
                    System.out.print("%");
                else System.out.print(" ");
            }
            index++;
            System.out.println("%");
        }

        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
        }
    }
}
