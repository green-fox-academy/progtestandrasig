package com.greenfox.practice.day3;

public class PrintAll {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
        // - Írasd ki a konzolra a `numbers` nevű tömb összes elemét

        int[] numbers = {4, 5, 6, 7};

        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
