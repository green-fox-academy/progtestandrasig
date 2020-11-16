package com.greenfox.practice.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Írj egy függvényt ami összepárosít egy fiút egy lánnyal, és visszaadja egy új listában.
        // Ha valakinek nincs párja, akkor is szerepeljen a listában.
        // Várt eredmény: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static List<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

        ArrayList<String> girlsAndBoys = new ArrayList<>();

        int girlsCount = girls.size();
        int boysCount = boys.size();

        int length = girlsCount >= boysCount ? girlsCount : boysCount;

        for (int i = 0; i < length; i++) {

            if (girlsCount > i)
                girlsAndBoys.add(girls.get(i));
            if (boysCount > i)
                girlsAndBoys.add(boys.get(i));
        }

        return girlsAndBoys;
    }
}