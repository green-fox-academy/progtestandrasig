package com.greenfox.practice.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        // Véletlenül elrontottam ezt a Richard Feynman idézetet.
        // Két szó nincs a helyén
        // Kérlek hozd helyre a hibát úgy, hogy megcseréled a két hibás helyen lévő szót.
        // A függvény neve legyen "quoteSwap()".

        // Írattassuk ki a mondatot szóközökkel elválasztva.

        System.out.println(quoteSwap(list));

        // Várt eredmény: "What I cannot create I do not understand."
    }

    private static String quoteSwap(ArrayList<String> list) {

        int accIndex = list.indexOf("do");
        String acc = list.set(list.indexOf("cannot"), "do");
        list.set(accIndex, acc);

        return String.join(" ", list);
    }
}