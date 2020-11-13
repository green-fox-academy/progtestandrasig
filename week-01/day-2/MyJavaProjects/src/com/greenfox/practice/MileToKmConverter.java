package com.greenfox.practice;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

        double miles = 10.5;    //...

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();

        miles = Double.parseDouble(inputString);
        double kilometers = miles / 1.5;

        System.out.println("Output: " + kilometers + "km");
    }
}