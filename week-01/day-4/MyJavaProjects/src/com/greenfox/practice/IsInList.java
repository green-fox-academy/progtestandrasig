package com.greenfox.practice.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Nézd meg a lista tartalmazza-e a következő elemeket: 4,8,12,16
        // Készíts egy függvényt, ami bemeneti paraméterként egy listát vár.
        // Térjen vissza "true"-val ha tartalmazza mindet, és "false"-al ha nem.

        System.out.println(checkNums(list));

        //Egy kis ráadás függvény :)
        System.out.println(checkNumsWithRefList(list, Arrays.asList(2, 8, 12, 15)));
    }

    private static boolean checkNums(ArrayList<Integer> list) {

        return list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16);
        //return list.containsAll(Collections.singleton(new int[]{4, 8, 12, 16}));
    }

    private static boolean checkNumsWithRefList(ArrayList<Integer> list, Collection<Integer> refList) {

        return list.containsAll(refList);
    }
}