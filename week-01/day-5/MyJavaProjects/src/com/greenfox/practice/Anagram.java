package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
//        Anagramma
//        Mi a fene az az anagramma?
//        Az anagramma a szójátékok egy fajtája, melyben értelmes szavak vagy mondatok betűinek sorrendjét úgy változtatjuk meg, hogy az eredmény szintén értelmes szó vagy mondat legyen. [több információért nézd meg az anagramma oldalt Wikipédián]
//
//        Gyakorlat
//        Készíts egy isAnagram nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót. A függvények bemeneten fogadnia a kell két stringet és visszaadni egy logikai (boolean) értéket attól függően, hogy a két string egymás anagrammája vagy sem.
//
//        Példák:
//        bemenet 1	    bemenet 2	    kimenet
//        "dog"	        "god"	        true
//        "green"	    "fox"	        false

        String text1 = "green";
        String text2 = "fox";

        System.out.println(text1 + " & " + text2 + (isAnagram(text1, text2) ? " are an anagram" : " aren't an anagram"));
    }

    private static boolean isAnagram(String text1, String text2) {

        boolean isAnAnagram = text1.length() == text2.length();

        if (isAnAnagram && text1.length() > 1) {

            List<Character> charList1 = text1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            List<Character> charList2 = text2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

            charList1.sort((a, b) -> a - b);
            charList2.sort((a, b) -> a - b);

            int index = 0;
            do {
                if (charList1.get(index) != charList2.get(index++))
                    isAnAnagram = false;

            }while (isAnAnagram && index < text1.length());
        }

        return isAnAnagram;
    }
}