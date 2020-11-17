package com.greenfox.practice.day5;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        Armstrong szám
//        Mi az az Armstrong szám?
//        Armstrong-számnak nevezünk egy n jegyű számot, ha minden számjegyét az n-edik hatványra emelve és összeadva, az eredeti számot kapjuk.
//
//        Demonstráljuk egy négy számjegyű számon: 1634 egy 4 jegyű szám, emeljük mind a 4 számjegyet a 4. hatványra és adjuk őket össze: 1^4 + 6^4 + 3^4 + 4^4 = 1634, tehát ez egy Armstrong szám.
//        Egy 3 számjegyű számnál: 153 egy 3 jegyű szám, emeljük mindegyik számjegyet a 3. hatványra és adjuk őket össze: 1^3 + 5^3 + 3^3 = 153, szóval ez is egy Armstrong szám.
//
//        Feladat:
//        Írj egy egyszerű programot, mely egy számot kér, és megmondja a számról, hogy Armstrong szám-e vagy nem.
//        Például ha beírjuk a 371-es számot akkor a programnak a következő formátumban kellene válaszolnia: A 371 egy Armstrong szám.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy számot: ");
        int number = scanner.nextInt();

        boolean isArmstrong = isAnArmstrongNumber(number);

        System.out.println("A(z) " + number + (!isArmstrong ? " nem " : " ") + "egy Armstrong szám.");
    }

    private static boolean isAnArmstrongNumber(int number) {

        char[] numbers = String.valueOf(number).toCharArray();
        int n = numbers.length;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += Math.pow( Integer.parseInt(String.valueOf(numbers[i])), n );
        }

        return sum == number;
    }
}