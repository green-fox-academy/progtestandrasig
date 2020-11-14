package com.greenfox.practice.day3;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Írj egy programot ami tárol egy számot és
        // a felhasználónak kell kitalálnia azt.
        // A felhasználó találgathat és
        // minden standard input-ba beírt szám után
        // a programnak ki kell írnia egyet ezek közül:
        //
        // A tárolt szám nagyobb
        // A tárolt szám kisebb
        // Eltaláltad a számot

        String yesOrNo = "i";

        while (yesOrNo.equals("i") || yesOrNo.equals("igen"))
        {
            int randomNumber = (int)Math.round(Math.random() * 100 + 1) ;

            System.out.println("Gondoltam egy számra egytől százig. Találd ki, hogy melyik ez a szám! ;)");

            int yourNumber;

            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Tippelj egy számra: ");
                yourNumber = scanner.nextInt();

                if (randomNumber > yourNumber)
                    System.out.println("A tárolt szám nagyobb");
                else if (randomNumber < yourNumber)
                    System.out.println("A tárolt szám kisebb");
                else System.out.println("Eltaláltad a számot");
            }while (yourNumber != randomNumber);

            System.out.println("\nJöhet egy új játék?! (i/n) :)");
            yesOrNo = scanner.next().toLowerCase();
        }
    }
}
