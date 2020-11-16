package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        //        Találd ki a számomat
//
//        Feladat:
//        Írj egy programot, amiben a program választ egy számot 1 és 100 között. Utána megkéri a program a játékost, hogy tippeljen egy számot. Ha a tipp rossz a program egy visszajelzést ad és megkér, hogy tippelj még egy számot egészen addig amíg a válasz nem lesz helyes.
//
//        Legyen a tippelési skála állítható.
//        Adj hozzá életeket (Opcionális)
//
//        Példa:
//
//        1 és 100 között gondoltam egy számra. 5 életed van. Tippelj!
//
//        > 20
//        Túl sok. 4 életed van.
//
//        > 10
//        Túl kevés. 3 életed van.
//
//        > 15
//        Gratulálok, nyertél!

        List<String> goodStrings = new ArrayList<>(Arrays.asList("i", "n", "igen", "nem"));

        String yesOrNo = "n";

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nJátszol velem egy 'Találd ki, hogy milyen számra gondoltam!' c. játékot?! (i/n) ;)");

        do {
            yesOrNo = scanner.next().toLowerCase();
        }while (!goodStrings.contains(yesOrNo));


        int maxValue = 0;
        int minValue = 0;

        if (yesOrNo.equals("i") || yesOrNo.equals("igen")) {

            yesOrNo = "n";

            System.out.println("\nRemek! Megfelel számodra, ha 1-től 100-ig gondolok egy számra? (i/n)");
            yesOrNo = scanner.next().toLowerCase();

            if (yesOrNo.equals("i") || yesOrNo.equals("igen")) {
                maxValue = 100;
                minValue = 1;
            }

            while ((yesOrNo.equals("n") || yesOrNo.equals("nem")) && maxValue - minValue < 10) {
                System.out.println("\nRendben! Akkor add meg, hogy mi legyen a legkisebb egész szám, amire gondolhatok!");
                minValue = scanner.nextInt();

                System.out.println("\nOké! Akkor most add meg, hogy mi legyen a legnagyobb egész szám, amire gondolhatok!");
                maxValue = scanner.nextInt();

                if (maxValue <= minValue)
                    System.out.println("Értelmetlen intervallum! A legkisebb számnak természetesen KISEBBNEK kell lennie, mint a legnagyobbnak.. Gondold újra! :P");
                else if (maxValue - minValue < 10)
                    System.out.println("Alulméretezett intervallum! A legnagyobb és legkisebb szám közötti különbségnek legalább 10-nek kell lennie.. Próbálkozz újra! :P");
            }

            System.out.println("\nSzuper, akkor kezdjük!");
        }
        else System.out.println("\nSajnálom, de talán majd legközelebb... =D");

        if (minValue != 0 && maxValue != 0)
            yesOrNo = "i";
        int numberOfLifes = 5;

        while (numberOfLifes > 0 && (yesOrNo.equals("i") || yesOrNo.equals("igen")))
        {
            int randomNumber = (int)Math.floor( (Math.random() * (maxValue - minValue)) + minValue );

            //System.out.println("Gondoltam egy számra egytől százig. Találd ki, hogy melyik ez a szám! ;)");
            System.out.println("\n" + minValue + " és " + maxValue + " között gondoltam egy számra. 5 életed van. Tippelj!");

            int yourNumber;

            do {
                System.out.print("Tippelj egy számra: ");
                yourNumber = scanner.nextInt();

                if (randomNumber > yourNumber)
                    System.out.println("Túl kevés. " + --numberOfLifes + " életed van.");
                else if (randomNumber < yourNumber)
                    System.out.println("Túl sok. " + --numberOfLifes + " életed van.");
                else System.out.println("Gratulálok, nyertél!");

                if (numberOfLifes == 0)
                    System.out.println("Sajnálom, elfogyott az életed! A játéknak vége.. :/");

            }while (numberOfLifes > 0 && yourNumber != randomNumber);

            System.out.println("\nJöhet egy új játék?! (i/n) :)");
            yesOrNo = scanner.next().toLowerCase();

            if (yesOrNo.equals("n") || yesOrNo.equals("nem"))
                System.out.println("\nKÖSZI A JÁTÉKOT! VISZLÁT!!");
            else {
                numberOfLifes = 5;
            }
        }

    }
}