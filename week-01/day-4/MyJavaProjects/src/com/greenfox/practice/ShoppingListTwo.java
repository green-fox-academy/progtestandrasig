package com.greenfox.practice.day3;

import java.util.HashMap;
import java.util.Map;

public class ShoppingListTwo {
    public static void main(String[] args) {
//        Bevásárló lista 2
//        Reprezentáld az alábbi termékeket és árukat:
//
//        Termék	        Ár
//        Milk	            1.07
//        Rice	            1.59
//        Eggs	            3.14
//        Cheese	        12.60
//        Chicken Breasts	9.40
//        Apples	        2.31
//        Tomato	        2.58
//        Potato	        1.75
//        Onion	            1.10
//
//        Bob bevásárló listája
//
//        Termék	Mennyiség
//        Milk	    3
//        Rice	    2
//        Eggs	    2
//        Cheese	1
//        Chicken Breasts	4
//        Apples	1
//        Tomato	2
//        Potato	1
//        Alice bevásárló lisjája
//
//        Termék	Mennyiség
//        Rice	    1
//        Eggs	    5
//        Chicken Breasts	2
//        Apples	1
//        Tomato	10
//
//        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
//
//        Mennyit fizet Bob?
//        Mennyit fizet Alice?
//        Ki vett több rizst (Rice)?
//        Ki vett több krumplit (Potato)?
//        Ki vett több különböző terméket?
//        Ki vett több különböző terméket? (ár)

        //A termékek listája:
        HashMap<String, Double> productsAndPrices = new HashMap<>();

        productsAndPrices.put("Milk", 1.07);
        productsAndPrices.put("Rice", 1.59);
        productsAndPrices.put("Eggs",	3.14);
        productsAndPrices.put("Cheese", 12.60);
        productsAndPrices.put("Chicken Breasts", 9.40);
        productsAndPrices.put("Apples", 2.31);
        productsAndPrices.put("Tomato", 2.58);
        productsAndPrices.put("Potato", 1.75);
        productsAndPrices.put("Onion", 1.10);

        //Bob bevásárló listája:
        HashMap<String, Integer> bobsList = new HashMap<>();

        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        //Alice bevásárló listája:
        HashMap<String, Integer> alicesList = new HashMap<>();

        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breasts", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        double bobKosara = 0;
        for (Map.Entry product : productsAndPrices.entrySet()) {

            Integer vol = bobsList.get(product.getKey());
            if (vol != null)
                bobKosara += vol * (double)product.getValue();
        }

        System.out.println("Bob is paying: " + bobKosara);

        double aliceKosara = 0;
        for (Map.Entry product : productsAndPrices.entrySet()) {

            Integer vol = alicesList.get(product.getKey());
            if (vol != null)
                aliceKosara += vol * (double)product.getValue();
        }

        System.out.println("Alice is paying: " + aliceKosara);

        int aliceRices = alicesList.get("Rice") == null || alicesList.get("Rice") == 0 ? 0 : alicesList.get("Rice");
        int bobRices = bobsList.get("Rice") == null || bobsList.get("Rice") == 0 ? 0 : bobsList.get("Rice");

        boolean aliceHasMoreRice = aliceRices > bobRices;

        System.out.println("More rice is: " + (aliceRices == bobRices ? "rice vol. is equal" :
                                                                                                (aliceHasMoreRice ? "Alice" : "Bob")));
        int alicePotatoes = alicesList.get("Potato") == null || alicesList.get("Potato") == 0 ? 0 : alicesList.get("Potato");
        int bobPotatoes = bobsList.get("Potato") == null || bobsList.get("Potato") == 0 ? 0 : bobsList.get("Potato");

        boolean aliceHasMorePotato = alicePotatoes > bobPotatoes;

        System.out.println("More potato is: " + (alicePotatoes == bobPotatoes ? "potato vol. is equal" :
                (aliceHasMorePotato ? "Alice" : "Bob")));

        String howPayingMoreProducts;
        if (alicesList.size() == bobsList.size())
            howPayingMoreProducts = "is equal";
        else howPayingMoreProducts = alicesList.size() > bobsList.size() ? "Alice" : "Bob";

        System.out.println("More products has: " + howPayingMoreProducts);

        if (bobKosara == aliceKosara)
            System.out.println("More paying is:  Bob and Alice paying equal!");
        else
            System.out.println("More paying is: " + (bobKosara > aliceKosara ? "Bob" : "Alice"));

    }
}