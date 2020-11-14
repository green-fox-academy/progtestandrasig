package com.greenfox.practice.day3;

public class DrawChessTable {
    public static void main(String[] args) {
        // Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        char evenChar;

        for (int i = 0; i < 8; i++) {

            if (i % 2 == 0) evenChar = ' ';
            else evenChar = '%';

            for (int j = 0; j < 8; j++) {
                if (evenChar == ' ')
                    System.out.print(j % 2 == 0 ? '%' : evenChar);
                else System.out.print(j % 2 == 0 ? ' ' : evenChar);
            }
            System.out.println();
        }
    }
}
