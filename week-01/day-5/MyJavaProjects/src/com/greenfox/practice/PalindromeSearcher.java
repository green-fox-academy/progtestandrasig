package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {
    public static void main(String[] args) {

//        Palindróma kereső
//        Mi is az a palindróma?
//
//        Gyakorlat
//        Készíts egy searchPalindrome nevű függvényt, ami követi a jelenlegi nyelv stílus útmutatóját. Bemeneten fogad egy stringet. Majd kikeresi, hogy taláhatóak-e 3 karakternél hoszabb palindrómák benne és végül visszaküldi a talált palindrómák listáját.
//
//        Példák:
//        bemenet	                            kimenet
//        "dog goat dad duck doodle never"	    ["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
//        "apple"	                            []
//        "racecar"	                            ["racecar", "aceca", "cec"]
//        ""	                                []

        String text = "dog goat dad duck doodle never";
        //String text = "racecar";

        System.out.println(searchPalindrome(text));
    }

    private static List<String> searchPalindrome(String text) {

        //if (text.length() % 2 == 1)
        //    return new ArrayList<>();

        if (text.length() < 3)
            return new ArrayList<>();

        List<String> subPalindromes = new ArrayList<>();

        int length = 3;
        int maxLength = text.length();

        String subString;
        ///boolean hasASubPalindrome = false;

        for (int i = length; i <= maxLength; i++) {

            for (int j = 0; j <= text.length() - length; j++) {

                subString = text.substring(j, j + length);

                if (isASubPalindrome(subString)) {
                    subPalindromes.add(subString);
                    ///hasASubPalindrome = true;
                }

                /*if (j == text.length() - length) {
                    //length++;
                    ///hasASubPalindrome = false;
                //}
                ///else if (j < text.length() - length && hasASubPalindrome) {
                    //hasASubPalindrome = false;
                }*/
            }

            length++;
            ///hasASubPalindrome = false;
        }

        return subPalindromes;
    }

    private static boolean isASubPalindrome(String subString) {

        boolean isAPalindrome = true;
        for (int i = 0; i < subString.length() / 2 && isAPalindrome; i++) {

            if (subString.charAt(i) != subString.charAt(subString.length() - 1 - i)) isAPalindrome = false;
        }

        return  isAPalindrome;
    }
}