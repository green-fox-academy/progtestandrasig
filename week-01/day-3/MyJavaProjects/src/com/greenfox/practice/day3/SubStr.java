package com.greenfox.practice.day3;

public class SubStr {
    public static void main(String[] args) {
        // Írj egy függvényt (function-t) ami 2 string paramétert vár
        // Térjen vissza (return) egy index-szel, ami megmondja,
        // hogy az első paraméterként megadott változóban
        // hanyadik karaktertől fordul elő a második paraméterként megadott string.
        // -1-gyel tér vissza (return) ha nem található meg a második paraméter
        // az első paraméterként megadott string-ben

        // Például:

        // Az eredmény: 17, mert a 'searching' a 17. indextől található meg.
        System.out.println(subStr("this is what I'm searching in", "searching"));

        // Az eredmény: -1, mert nem található meg benne
        System.out.println(subStr("this is what I'm searching in", "not"));

        //Saját teszt bemenettel - a helyes kimenet a 10!
        System.out.println(subStr("valahol a Banán-szigeteken...", "Banán-sziget"));
    }

    public static int subStr(String input, String q) {

        int index = -1;
        int inputLength = input.length();
        int qLength = q.length();

        for (int i = 0; i <= inputLength - qLength && index == -1; i++) {
            if (input.substring(i, i + qLength).equals(q))
                index = i;
        }
        return index;
    }
}