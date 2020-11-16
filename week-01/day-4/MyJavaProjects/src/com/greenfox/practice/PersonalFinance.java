package com.greenfox.practice.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PersonalFinance {
    public static void main(String[] args) {

//        Személyes pénzügyek
//        A kiadásainkat egy Integereket tartalmazó listával fogjuk reprezentálni.
//
//        Készíts egy listát az alábbi elemekkel:
//
//        500, 1000, 1250, 175, 800 és 120
//        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
//
//        Mennyit költöttünk?
//        Melyik volt a legnagyobb kiadásunk?
//                Melyik volt a legkisseb kiadásunk?
//        Mennyi volt az átlag kiadásunk?

        List<Integer> personalList = new ArrayList<Integer>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        //A lista feltöltése 0-áról kicsit másképp:
        //personalList = new ArrayList<>();
        //Integer[] arr = new Integer[] { 500, 1000, 1250, 175, 800, 120 };
        //personalList.addAll(Arrays.asList(arr));

        //Elemek kiíratása ellenőrzés céljából:
        personalList.forEach(element -> {
            System.out.println(element);
        });

        System.out.println();

        financeCalculator(personalList);
    }

    public static void financeCalculator(List<Integer> list) {

        //Integer típusú listán nem értelmezhető a sum() függvény, ezért egy kis "átalakításra" van hozzá szükség :P
        int sum = list.stream().mapToInt(num -> num).sum();

        //A sum értékét természetesen máshogyan is kiszámíthatjuk:
        //for (Integer num : list) {
        //    sum += num;
        //}

        //ATOMIC????
        //AtomicInteger sum = new AtomicInteger(list.stream().mapToInt(num -> num).sum());
        //...
        //sum.set(0);
        //list.forEach(number -> { sum.addAndGet(number);});

        System.out.println("Sum: " + sum);

        List<Integer> copyList = new ArrayList<>(list);

        copyList.sort((a, b) -> { return b - a; });

        //Kiíratás ellenőrzéshez:
        /*System.out.println();
        copyList.forEach(element -> {
            System.out.println(element);
        });*/

        int max = copyList.get(0);
        int min = copyList.get(copyList.size() - 1);

        System.out.println("\nMin: " + min);

        System.out.println("\nMax: " + max);

        double avg = (double)sum / list.size();

        System.out.println("\nAvg: " + avg);
    }
}
