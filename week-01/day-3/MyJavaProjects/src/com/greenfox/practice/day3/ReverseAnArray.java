package com.greenfox.practice.day3;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseAnArray {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
        // - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
        // - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit

        int[] numbers = {4, 5, 6, 7};
        int length = numbers.length;

        int item;
        for (int i = 0; i < length / 2; i++) {
            item = numbers[length - i - 1];
            numbers[length - i - 1] = numbers[i];
            numbers[i] = item;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + (i < length - 1 ? ", ": ""));
        }

        System.out.println();

        //Plusz feladat:  a tömb eredeti sorrendjének visszaállítása, beépített tömb-metódussal ->
        //numbers = Arrays.stream(numbers).sorted().toArray();
        Arrays.sort(numbers);   //ezzel is működik!!
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + (i < length - 1 ? ", ": ""));
        }

        //Extra feladat:  a tömb elemeinek sorrendjét ismét megfordítjuk, az imént használt sorted metódussal ->
        //Arrays.sort(numbers);  Reversed sorting...???
        //for (int i = 0; i < length; i++) {
        //    System.out.print(numbers[i] + (i < length - 1 ? ", ": ""));
        //}

    }
}
