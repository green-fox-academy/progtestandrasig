package com.greenfox.practice;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Add meg az " + i + ". egész számot: ");
            sum += scanner.nextInt();
        }

        System.out.println("Összeg: " + sum + ", Átlag: " + sum / 5.0);
    }
}