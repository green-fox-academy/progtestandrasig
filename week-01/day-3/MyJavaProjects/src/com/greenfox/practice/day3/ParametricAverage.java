package com.greenfox.practice.day3;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból.
        // Amennyi az első szám értéke volt, annyiszor kell új számot kérnie.
        // Ha megkapta az összes számot, printelje ki az összegét és
        // az átlagát ezeknek a számoknak a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem adjon meg egy számot: ");
        int number = scanner.nextInt();

        int[] numbers = new int[number];
        int sum = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Kérem adja meg a(z) " + (i + 1) + ". számot: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("\nÖsszeg: " + sum + ", Átlag: " + (double)sum / number);
    }
}