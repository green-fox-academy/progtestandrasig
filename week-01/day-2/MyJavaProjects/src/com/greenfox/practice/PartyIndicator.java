package com.greenfox.practice;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk aránya nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a lányok létszámát: ");
        int girls = scanner.nextInt();

        System.out.print("Add meg a fiúk létszámát: ");
        int boys = scanner.nextInt();

        int partyFaces = girls + boys;

        if (partyFaces > 20 && girls == boys)
            System.out.println("Ez a buli kitűnő!");
        else if (partyFaces > 20 && girls != boys)
            System.out.println("Ez a buli egész jó!");
        else if (partyFaces < 20)
            System.out.println("Átlagos buli...");

        if (girls == 0)
            System.out.println("Virsli party");
    }
}