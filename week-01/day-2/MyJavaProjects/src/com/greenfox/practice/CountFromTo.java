package com.greenfox.practice;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Készíts egy programot, ami két számot kér
        // Ha a második szám nem nagyobb, mint az első, írja ki:
        // "A második számnak nagyobbnak kellene lennie!"
        //
        // Amennyiben nagyobb,
        // az első számtól kezdve el kellene számolnia egyesével a másodikig
        //
        // Például:
        //
        // első szám: 3, második szám: 6, ezt kellene printelnie:
        //
        // 3
        // 4
        // 5

        int num1 = 0, num2 = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Adjon meg egy számot: ");
            num1 = scanner.nextInt();

            System.out.print("Adjon meg még egy számot: ");
            num2 = scanner.nextInt();

            if (num2 <= num1) System.out.println("A második számnak nagyobbnak kellene lennie!");

        } while (num2 <= num1);

        //if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {

                System.out.println(i);
            }
        //}

        /*int number = num1;
        do {
            System.out.println(number);
        }while (number++ < num2);*/
    }
}
