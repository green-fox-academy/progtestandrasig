package com.greenfox.practice.day3;

import java.util.HashMap;
import java.util.Map;

public class MapIntroductionMethods {
    public static void main(String[] args) {

//        Készíts egy asszociatív tömböt (Map) ahol a kulcsok (keys) és az értékek (values) Stringek a következő kulcs-érték párokkal:
//
//        Kulcs (Key)	Érték (Value)
//        978-1-60309-452-8	    A Letter to Jo
//        978-1-60309-459-7	    Lupus
//        978-1-60309-444-3	    Red Panda and Moon Bear
//        978-1-60309-461-0	    The Lab

//        Írasd ki az összes kulcs-érték párt a következő formátumba:
//
//        A Letter to Jo (ISBN: 978-1-60309-452-8)
//        Lupus (ISBN: 978-1-60309-459-7)
//        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//        The Lab (ISBN: 978-1-60309-461-0)
//
//        Távolítsd el azt a kulcs-érték párt melynek a kulcsa 978-1-60309-444-3.
//
//        Távolítsd el azt a kulcs-érték párt melynek az értéke The Lab.
//
//        Add hozzá az alábbi kulcs-érték párokat a Map-hez:
//
//        Kulcs (Key)	Érték (Value)
//        978-1-60309-450-4	    They Called Us Enemy
//        978-1-60309-453-5	    Why Did We Trust Him?
//
//        Írasd ki van-e érték társítva a 478-0-61159-424-8-as kulcshoz vagy sem.
//
//        Írasd ki a 978-1-60309-453-5- as kulcshoz tartozó értéket.

        HashMap<String, String> stringMap = new HashMap<>();

        stringMap.put("978-1-60309-452-8", "A Letter to Jo");
        stringMap.put("978-1-60309-459-7", "Lupus");
        stringMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        stringMap.put("978-1-60309-461-0", "The Lab");

        stringMap.forEach((key, value) -> {
            System.out.println(value + " (ISBN: " + key + ")");
        });

        System.out.println();

        stringMap.remove("978-1-60309-444-3");

        /// stringMap.remove("The Lab")  ????

        //Ezzel a for-ciklusos megoldással az esetleges többszörös value(érték)-előfordulást is kiszed(het)jük a tömbből:
        //(illetve ha break-et használunk, akkor nyilván csak az első előfordulást törli!)
        for (Map.Entry entry : stringMap.entrySet()) {

            if (entry.getValue() == "The Lab")
            {
                stringMap.remove(entry.getKey());
                break;
            }
        }

        stringMap.put("978-1-60309-450-4", "They Called Us Enemy");
        stringMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println("Have this hashmap the '478-0-61159-424-8' key?: " + (stringMap.get("478-0-61159-424-8") != null));

        System.out.println("\n" + stringMap.get("978-1-60309-453-5"));

        /*System.out.println();

        stringMap.forEach((key, value) -> {
            System.out.println(value + " (ISBN: " + key + ")");
        });*/

    }
}