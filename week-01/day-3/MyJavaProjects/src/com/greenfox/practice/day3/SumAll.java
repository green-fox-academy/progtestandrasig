package com.greenfox.practice.day3;

import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
        // - Írasd ki a konzolra a `numbers` tömb összes elemének összegét

        int[] numbers = {3, 4, 5, 6, 7};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        Arrays.stream(numbers).sum();
        System.out.println("Sum: " + sum);

        //vagy tömb-metódus használatával:
        //System.out.println("Sum: " + Arrays.stream(numbers).sum());
    }
}