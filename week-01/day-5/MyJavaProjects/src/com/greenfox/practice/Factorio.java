package com.greenfox.practice.day5;

public class Factorio {
    public static void main(String[] args) {

// - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.

        int num = 5;

        System.out.println(num + "! = " + factorio(num));
    }

    private static int factorio(int number) {

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}