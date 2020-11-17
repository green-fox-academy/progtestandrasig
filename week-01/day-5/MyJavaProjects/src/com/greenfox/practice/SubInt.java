package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        // - Készíts egy függvényt ami bemeneti paraméterként egy számot és egy integer array-t vár.

        // - Visszaadja a bemeneti tömb azon indexeit, ahol a tömb értékei tartalmazzák az első bemeneti értéket.
        // - Vagy egy üres array-t ad vissza, amennyiben az első bemeneti értéket a lista sehol sem tartalmazza.

        //  Példa:

        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));

        //  Eredmény kiíratva: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));

        //  Eredmény kiíratva: '[]'

        // Megjegyzés: Az array kiirattatására használhatjuk az Arrays.toString() függvényt.
        // Vagy használhatjuk a végigiterálást is.

        int number = 0;
        int[] numArray = new int[] { 1, 11, 34, 52, 61 };

        System.out.println();
    }

    private static int[] subInt(int number, int[] array) {

        List<Integer> indexes = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (String.valueOf(array[i]).contains(String.valueOf(number)))
                indexes.add(count++, i);
        }

        int[] indexArray = new int[count];

        if (count > 0) {

            for (int i = 0; i < count; i++)
                indexArray[i] = indexes.get(i);
        }

        return indexArray;
    }
}