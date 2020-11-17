package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        // - Készíts egy függvényt ami bemeneti paraméterként egy integer array-t vár.
        // - A függvény térjen vissza egy olyan listával ahol az összes szám csak egyszer fordul elő.

        //  Példa:
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));

        //  Eredmény kiíratva: `[1, 11, 34, 52, 61]`
    }

    private static List<Integer> unique(int[] ints) {

        List<Integer> list = new ArrayList<>();

        for (int number : ints) {

            if (!list.contains(number))
                list.add(number);
        }
        return list;
    }
}