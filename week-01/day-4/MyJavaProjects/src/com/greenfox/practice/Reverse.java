package com.greenfox.practice.day3;

import java.util.Arrays;
import java.util.Vector;

public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Készíts egy függvényt ami megfordít egy Stringet, amit
        // bemeneti paraméterként kap.
        // Használd a függvényt a "toBeReversed" változón ellenőrzésként.
        // Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
        // opcionálisan akárhogy.




        System.out.println(reverse(toBeReversed));

    }

    public static String reverse(String text) {

        int length = text.length();
        ///char[] reversedChars = new char[length];
        //String reversedString = "";

        StringBuffer reversed = new StringBuffer();

        for (int i = 1; i <= length; i++) {

            reversed.append(text.charAt(length - i));
            ///reversedChars[i - 1] = text.charAt(length - i);
        }

        ///reversedString = Arrays.toString(reversedChars);

        return reversed.toString();
    }

    //public static String reverseString(String text) {

      //  int length = text.length();
      //  char[] reversedChars = text.toCharArray();
        //String reversedString = "";

        //...

      //  return reversed.toString();
    //}
}