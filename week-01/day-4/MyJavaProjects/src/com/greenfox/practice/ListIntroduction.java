package com.greenfox.practice.day3;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {

//        Készíts egy üres listát, ami Stringeket tartalmaz.
//        Írasd ki a lista elemeinek a számát.
//                Add hozzá(add) Williemet a listához.
//                Írasd ki a lista üres e vagy sem.
//                Add hozzá Johnt a listához.
//        Add hozzá Amandát a listához.
//                Írasd ki a lista elemeinek a számát.
//        Írasd ki a lista harmadik elemét.
//        Iterálj végig a listán és írasd ki az összes nevet
//        William
//                John
//        Amanda
//        Töröld a második elemet a listából
//        Iterálj végig a listán fordított sorrendben és írasd ki az összes nevet.
//        Amanda
//                William
//        Távolítsd el a lista összes elemét.

        List<String> stringList = new ArrayList<>();

        System.out.println(stringList.size());

        stringList.add("William");

        System.out.println(stringList.size() == 0);

        stringList.add("John");
        stringList.add("Amanda");

        System.out.println(stringList.size());
        System.out.println(stringList.get(2));

        System.out.println();

        for (String name : stringList) {

            System.out.println(name);
        }

        System.out.println();

        stringList.remove(1);

        for (int i = stringList.size() - 1; i >= 0; i--) {

            System.out.println(stringList.get(i));
        }

        stringList.clear(); 
    }
}
