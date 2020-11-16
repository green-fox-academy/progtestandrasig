package com.greenfox.practice.day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
//        Bevásárló lista
//        Bevásárlólistánkat egy listaként fogjuk reprezentálni mely Stringeket tartalmaz.
//
//        Készíts egy listát az alábbi tételekkel:
//        eggs, milk, fish, apples, bread és chicken

//        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
//        Van tejünk a listán?
//        Van banánunk a listán?

        List<String> shoppings = new ArrayList<String>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        System.out.println("We have Milk: " + shoppings.contains("milk"));

        System.out.println("We have Banane: " + shoppings.contains("banane"));
    }
}