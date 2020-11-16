package com.greenfox.practice.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Candyshop{
    public static void main(String... args){

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Véletlenül hozzáadtunk a listához egy "2"-t és egy "false"-ot.
        // Kérlek javítsd a hibákat, és változtasd a "2"-t "Croissant"-ra a "false"-ot pedig "Ice cream"-re.
        // Ne csak töröld az elemeket.
        // Készíts egy függvényt "sweets()" névvel ami bemeneti paraméterként egy listát vár,
        // és elvégzi a fenti műveleteket!

        System.out.println(sweets(arrayList));
        // Várt eredmény: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    private static ArrayList<Object> sweets(ArrayList<Object> arrayList) {

        arrayList = (ArrayList<Object>)arrayList.stream().map(el -> {

            if (el.equals(2))
                return "Croissant";
            else if (el.equals(false))
                return "Ice cream";
            else return el;
        }).collect(Collectors.toList());

        return arrayList;
    }
}