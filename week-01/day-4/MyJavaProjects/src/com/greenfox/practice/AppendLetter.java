package com.greenfox.practice.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AppendLetter{
    public static void main(String... args){

        List<String> animals = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        // Készíts egy függvényt `appendA()` névvel ami hozzáad egy `a`
        // betűt az animals lista összes eleméhez.
        // A listát a függvény paraméterként fogadja

        // A várt eredmény: "boa", "anaconda", "koala", "panda", "zebra"


        System.out.println(appendA(animals));
    }

    public static List<String> appendA(List<String> listOfStrings) {

        return listOfStrings.stream().map(el -> el + "a").collect(Collectors.toList());
    }
}