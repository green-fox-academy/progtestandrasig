package com.greenfox.practice.day3;

import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
//        Asszociatív tömbökkel(Map) fogunk játszani. Nyugodtan használj bármilyen beépített függvényt, ahol lehetséges.
//
//                Készíts egy üres asszociatív tömböt (Map) ahol a kulcsok(keys) integerek és az értékek(values) karakterek.
//
//                Írasd ki hogy a map üres e vagy sem.
//
//        Add hozzá az alábbi kulcs(key) érték(value) párokat a map-hez.
//
//                Kulcs (Key)	Érték (Value)
//                97	a
//                98	b
//                99	c
//                65	A
//                66	B
//                67	C
//        Írasd ki az összes kulcsot.
//
//                Írasd ki az összes értéket.
//
//        Add hozzá a D értéket az 68-as kulccsal.
//
//                Írasd ki hány kulcs érték pár van a map-ben.
//
//                Írasd ki a 99-es kulcshoz tartozó értéket.
//
//                Töröld ki azt a kulcs-érték párt, ahol a kulcs 97.
//
//        Írasd ki van-e társítva érték a 100-as kulcshoz vagy sem.
//
//                Távolítsd el az összes kulcs érték párt.

        HashMap<Integer, Character> testMap = new HashMap<>();

        System.out.println(testMap.size() == 0);

        testMap.put(97, 'a');
        testMap.put(98, 'b');
        testMap.put(99, 'c');
        testMap.put(65, 'A');
        testMap.put(66, 'B');
        testMap.put(67, 'C');

        //ForEach ciklussal (lambda-kifejezés segítségével!) végigmegyek a kulcsok "listáján" (Set-jén),
        //amit előzőleg összegyűjtöttem a Map keySet() függvényével:
        System.out.println("\nKeys: ");
        testMap.keySet().forEach(key -> {
            System.out.println(key);
        });

        //De hagyományos módon, azaz egyszerű for-ciklussal is végigmehetek rajtuk, ez esetben az összes benne lévő
        //értéken, amihez a values() függvény használható - ez egy Collection típusú "listával" tér vissza ami iterálható:
        System.out.println("\nValues: ");
        for (Character value : testMap.values()){
            System.out.println(value);
        }

        System.out.println();

        testMap.put(68, 'D');

        System.out.println(testMap.size());

        System.out.println(testMap.get(99));

        testMap.remove(97);

        System.out.println(testMap.get(100) != null);

        testMap.clear();
    }
}