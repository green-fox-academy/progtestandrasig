package com.greenfox.practice.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubStrList {
    public static void main(String[] args) {
        // Készíts egy függvényt, amely paraméterként egy Stringet és
        // egy List<String>-et(??) vár.
        // A függvény térjen vissza a list azon indexével, ahol a
        // listában szereplő String-nek a része a paraméterben megadott String.
        // Elég ha az elsőt megtalálja és azzal tér vissza.
        // Ha nem talál egyik elemében sem a listának térjen vissza -1 el.

        //  Példa:
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};


        System.out.println(subStrList("ching", searchArr));
        //  Várt eredmény: `4`
        System.out.println(subStrList("not", searchArr));
        //  Várt eredmény: `-1`
        System.out.println(subStrList("hat", searchArr));
        //  Várt eredmény: `2`
    }

    private static int subStrList(String subString, String[] searchArr) {

        List<String> searchList = Arrays.asList(searchArr);

        ///boolean getFirstItem = false;

        List<String> selectedElements = searchList.stream().filter(item -> {

            ///if (!getFirstItem && item.contains(subString)) {
             if (item.contains(subString)) {
                 ///getFirstItem = true;
                 return true;
             }
             else
                 return false;
         }).collect(Collectors.toList());

        //Kiíratás "hibaellenőrzésre":
        //System.out.println(selectedElements);
        //if (selectedElements.size() > 0) System.out.println(searchList.indexOf(selectedElements.get(0)));

        int index = selectedElements.size() > 0 ? searchList.indexOf(selectedElements.get(0)) : -1;

        return index;
    }
}