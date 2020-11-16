package com.greenfox.practice.day3;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
//        Termék adatbázis
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
//        How much is the fish?
//        Melyik a legdrágább termék?
//        Mi a termékek átlag ára?
//        Hány termék ára van 300 alatt?
//        Van-e olyan termék melyet pontosan 125Ft-ért tudunk megvenni?
//        Melyik a legolcsóbb termék?

        Map<String, Integer> products = new HashMap<String, Integer>();

        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println("How much is the fish?: " + products.get("Fish"));

        System.out.println("Max price: " + products.values().stream().max((a, b) -> { return a - b; }).get());

        System.out.println("Avg. price: " + (double)products.values().stream().mapToInt(num -> num).sum() / products.size());

        System.out.println("Price lower than 300: " + products.values().stream().filter(val -> val < 300).count());

        System.out.println("Have product(s) that(s) price is 125: " + (products.values().stream().filter(val -> val == 125).count() > 0 ? "Yes" : "No"));

        System.out.println("Min price: " + products.values().stream().min((a, b) -> { return a - b; }).get());
    }
}
