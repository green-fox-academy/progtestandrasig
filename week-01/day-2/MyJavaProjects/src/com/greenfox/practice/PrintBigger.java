package com.greenfox.practice;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem adja meg az első számot: ");
        int number1 = scanner.nextInt();

        System.out.print("Kérem adja meg a második számot: ");
        int number2 = scanner.nextInt();

        //if (number1 > number2) System.out.println(number1);
        //else System.out.println(number2);

        System.out.println(number1 > number2 ? number1 : number2);
    }
}