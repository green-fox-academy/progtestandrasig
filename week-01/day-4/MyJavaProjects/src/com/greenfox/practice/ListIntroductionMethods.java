package com.greenfox.practice.day3;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListIntroductionMethods {
    public static void main(String[] args) {
//        Készíts egy listát ('listA') mely tartalmazza a következő értékeket:
//
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Készíts egy új listát listB névvel amely a listA értékeit tartalmazza.
//        Írattasd ki hogy a listA tartalmazza-e a Durian-t vagy sem.
//
//        Távolítsd el a Durian-t a listB-ből.
//
//        Add hozzá a Kivifruit-ot a listA 4. eleme utánn.
//
//        Hasonlítsd össze listA és listB méretét.
//
//        Keresd meg az Avocado indexét a listA-ban.
//
//        Keresd meg az Durian indexét a listB-ban.
//
//        Add hozzá a listB-hez a Passion Fruit-ot és a Pomelo-t egyszerre.
//
//        Írasd ki a listA 3. elemét.

        String[] inputArray = { "Apple", "Avocado", "Blueberries", "Durian", "Lychee" };

        //KÉRDÉS:  miért nem lehet a deklarációkor, a sima zárójelek között (konstruktorral) egyből egy lista-tartalmat
        // - vagyis egy tetszőleges, string-collection-t átadni neki?
        List<String> listA = new ArrayList<>();

        //VÁLASZ a fenti kérdésre:  lehet, méghozzá az Arrays osztály asList függvényével(metódusával):
        //List<String> listC = new ArrayList<>(Arrays.asList(new String[]{"Apple", "Avocado", "Blueberries", "Durian", "Lychee"}));

        ///Miért nem működik? --> Válasz fent:  az Arrays.asList() metódussal "wrappolni"/csomagolni" kell
        ///a paraméterként átadott sztring-tömböt!!!
        ///listC.addAll(inputArray);       //-> NEM JÓ! :'(
        ///listC.addAll(Arrays.asList(inputArray));    //-> JÓ!!! :D



        //Így meg már lefut :))
        //listA.addAll(Arrays.asList(new String[]{"Apple", "Avocado", "Blueberries", "Durian", "Lychee"}));
        //...ami ugyanaz, mint ez itt egyszerűbben - csak egy korábban létrehozott tömbbel:
        listA.addAll(Arrays.asList(inputArray));
        //Collections.addAll(listA, new String[]{"Apple", "Avocado", "Blueberries", "Durian", "Lychee"});
        //Valójában elég lett volna felsorolni az összes listaelemet, mint paramétereket az Arrays.asList() metódusnak:
        //listA.addAll(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        listA.forEach(item -> {
            System.out.println(item);
        });

        List<String> listB = new ArrayList<>(listA);

        System.out.println("listA contains 'Durian': " + listA.contains("Durian"));

        listB.remove("Durian");

        listA.add(4, "Kivifruit");

        System.out.println("listA.size() > listB.size() ? " + (listA.size() > listB.size()));

        int indexOfAvocado = listA.indexOf("Avocado");
        int indexOfDurian = listB.indexOf("Durian");

        //Több elem egyszerre történő hozzáadása listához, kétféle módon:
        //Collections.addAll(listB, new String[]{"Passion Fruit", "Pomelo"});
        listB.addAll(Arrays.asList(new String[]{"Passion Fruit", "Pomelo"}));

        System.out.println(listA.get(2));
    }
}
