package com.greenfox.practice.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
//        Telefonkönyv
//        A névjegyzékünket egy asszociatív tömbként(Map) fogjuk reprezentálni ahol a nevek és a telefonszámok Stringek.
//
//        Készíts egy Map-et az alábbi kulcs-érték párokkal:
//
//        Név (kulcs)	        Telefonszám (érték)
//        William A. Lathan	    405-709-1865
//        John K. Miller	    402-247-8568
//        Hortensia E. Foster	606-481-6467
//        Amanda D. Newland	    319-243-5613
//        Brooke P. Askew	    307-687-2982

//        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
//
//        Mi John K. Miller telefonszáma?
//        Kinek a száma a 307-687-2982?
//        Tudjuk-e Chris E. Myer telefonszámát?

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println("\nJohn K. Miller's phone number: " + phoneBook.get("John K. Miller"));

        String value = "307-687-2982";
        String key = "";

        //Key megkeresése for ciklussal:
        /*for (Map.Entry keyValuePairs : phoneBook.entrySet()) {

            if (keyValuePairs.getValue() == "307-687-2982") {

                key = keyValuePairs.getKey().toString();
                break;
            }
        }*/

        //Az egyszerű kereséshez, majd kiíratáshoz használhatunk lambdát:
        phoneBook.forEach((k, val) -> {

            if (val == "307-687-2982") {

                //key = k;      // -> foreach-ben - lambda kifejezés esetén - nem használhatunk "külső" változókat???
                System.out.println("\nThe '307-687-2982' number's owner: " + k);
                //break;        // -> break utasítást szintén nem használhatjuk foreach-ben/lambda kifejezés esetén/
            }
        });

        System.out.println("\nPhonebook contains Chris E. Myer: " + (phoneBook.get("Chris E. Myer") != null));
    }
}
