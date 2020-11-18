package com.greenfox.practice.day5;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Bubble {
    public static void main(String[] args) {

        // - Készíts egy függvényt `buddle` névvel ami bemeneti paraméterként egy integer listát(??) vár.
        // - A fügvény egy listát adjon vissza ahol a lista elemei növekvő sorrendbe vannak rendezve.

        // - Készíts egy második függvényt `advancedBubble` névvel ami két paramétert vár, egy integer listát
        //   és egy booleant.
        // - A fügvény egy listát adjon vissza, ahol a lista elemei növekvő sorrendbe vannak rendezve,
        //   ha a boolean false. Ha pedig true, akkor a listát csökkenő sorrendbe rendezve adja vissza.

        //  Példa:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  Eredmény kiíratva: [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  Eredmény kiíratva: [34, 24, 12, 9, 5]

        System.out.println(bubbleSort(new int[] {34, 12, 24, 9, 5}));
        System.out.println(advancedBubbleSort(new int[] {34, 12, 24, 9, 5}, true));
    }

    private static List<Integer> bubbleSort(int[] ints) {

        int length = ints.length;
        int minValue;
        int indexOfMin = 0;

        for (int i = 0; i < length; i++) {

            minValue = Integer.MAX_VALUE;
            for (int j = i; j < length; j++) {

                if (ints[j] < minValue)
                {
                    minValue = ints[j];
                    indexOfMin = j;
                }
            }

            if (ints[i] != minValue) {

                ints[indexOfMin] = ints[i];
                ints[i] = minValue;
            }
        }

        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    private static List<Integer> advancedBubbleSort(int[] ints, boolean decreasingNotincreasing) {

        int length = ints.length;
        int maxValue, minValue;
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < length; i++) {

            minValue = Integer.MAX_VALUE;
            maxValue = Integer.MIN_VALUE;
            for (int j = i; j < length; j++) {

                if (decreasingNotincreasing && ints[j] > maxValue)
                {
                    maxValue = ints[j];
                    indexOfMax = j;
                }
                else if (!decreasingNotincreasing && ints[j] < minValue)
                {
                    minValue = ints[j];
                    indexOfMin = j;
                }
            }

            if (decreasingNotincreasing && ints[i] != maxValue) {

                ints[indexOfMax] = ints[i];
                ints[i] = maxValue;
            }
            else if (!decreasingNotincreasing && ints[i] != minValue) {
                ints[indexOfMin] = ints[i];
                ints[i] = minValue;
            }
        }

        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    private static List<Integer> bubble(int[] ints) {

        List<Integer> sortedList = Arrays.stream(ints).boxed().collect(Collectors.toList());

        sortedList.sort(((a, b) -> a - b));

        return  sortedList;
    }

    private static List<Integer> advancedBubble(int[] ints, boolean decreasingNotincreasing) {

        List<Integer> sortedList = Arrays.stream(ints).boxed().collect(Collectors.toList());

        if (!decreasingNotincreasing)
            sortedList.sort(((a, b) -> a - b));
        else
            sortedList.sort(((a, b) -> b - a));

        return  sortedList;
    }
}