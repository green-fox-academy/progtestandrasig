package com.greenfox.practice.day5;

public class Sum {
    public static void main(String[] args) {

// - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.

        int maxNumber = 100;

        System.out.println("Sum of 0.." + maxNumber + " is equal " + sum(maxNumber));
    }

    private static int sum(int maxNumber) {

        int summa = 0;
        for (int i = 1; i <= maxNumber; i++) {
            summa += i;
        }
        return summa;
    }
}