package com.greenfox.practice.day3;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabaseTwo {
    public static void main(String[] args) {
//        Termék adatbázis 2
//        A termék adatbázisunkat egy asszociatív tömbként(Map) fogjuk reprezentálni, ahol a termék nevek (kulcs) Stringek és azok árai (érték) pedig Integerek.
//
//        Készíts egy Map-et az alábbi kulcs-érték párokkal:
//
//        Termék név (kulcs)	Ár (érték)
//        Eggs	                200
//        Milk	                200
//        Fish	                400
//        Apples	            150
//        Bread	                50
//        Chicken	            550

//        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
//
//        Mely termékek kerülnek kevesebbe mint 201? (csak a név)
//        Mely termékek kerülnek többe mint 150? (név és ár)

        HashMap<String, Integer> products = new HashMap<String, Integer>();

        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println("\nPrice lower than 201:");

        for (Map.Entry product : products.entrySet()) {

            if ((int)product.getValue() < 201)
                System.out.println(product.getKey());
        }

        System.out.println("\nPrice higher than 150:");

        for (Map.Entry product : products.entrySet()) {

            if ((int)product.getValue() > 150)
                System.out.println(product.getKey() + " (" + product.getValue() + ")");
        }
    }
}
