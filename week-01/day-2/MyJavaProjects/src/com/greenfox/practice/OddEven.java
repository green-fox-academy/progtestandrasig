package com.greenfox.practice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy egész számot: ");
        int number = scanner.nextInt();

        //boolean isAnEvenNumber = number % 2 == 1;
        boolean isAnOddNumber = number % 2 == 0;

        //System.out.println(isAnEvenNumber ? "Páratlan" : "Páros");
        System.out.println(isAnOddNumber ? "Páros" : "Páratlan");

        //if (isAnEvenNumber) System.out.println("Páratlan");
        //else System.out.println("Páros");
    }
}