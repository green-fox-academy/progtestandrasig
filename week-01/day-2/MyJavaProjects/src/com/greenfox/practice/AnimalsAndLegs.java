package com.greenfox.practice;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a farmer tyúkjainak a számát: ");
        String inputString = scanner.next();

        int tyukok = Integer.parseInt(inputString);

        System.out.print("Add meg a farmer sertéseinek a számát: ");
        inputString = scanner.next();

        int sertesek = Integer.parseInt(inputString);


    }
}