package com.greenfox.practice.day5;

public class PalindromeBuilder {
    public static void main(String[] args) {

//        Palindróma építő
//        Mi a fene az a palindróma?
//        A palindróma egy olyan szó, mondat, szám vagy karaktersorozat, ami visszafelé olvasva is ugyanaz. Mint az apa, a tettet vagy a görög. [több információért nézd meg a palindrom Wikipédia oldalt]
//
//        Gyakorlat
//        Készíts egy createPalindrome nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót. A függvények bemeneten fogad egy stringet, készít belőle egy palindrómát és visszaadja azt.
//
//        Példák
//        bemenet	    kimenet
//        ""	        ""
//        "greenfox"	"greenfoxxofneerg"
//        "123"	        "123321"

        String notAPalindrome = "greenfox";

        System.out.println("A palindrome from '" + notAPalindrome + "': " + createPalindrome(notAPalindrome));
    }

    private static String createPalindrome(String notAPalindrome) {

        for (int i = notAPalindrome.length() - 1; i >= 0; i--) {

            notAPalindrome += notAPalindrome.charAt(i);
        }

        return notAPalindrome;
    }
}