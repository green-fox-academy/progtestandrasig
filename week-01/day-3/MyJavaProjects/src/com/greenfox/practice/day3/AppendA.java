package com.greenfox.practice.day3;

public class AppendA {
    public static void main(String[] args) {
        // - Készíts egy `animals` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `["koal", "pand", "zebr"]`
        // - Minden elemhez csatolj egy "a" betűt a szó végére

        String[] animals = {"koal", "pand", "zebr"};

        for (int i = 0; i < animals.length; i++) {
            animals[i] += "a";
            //animals[i] = animals[i].concat("a");    //Kicsit bonyolultabban is  működik! :)
        }

        //Kiíratás (ellenőrzéshez):
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + (i < animals.length - 1 ? ", ": ""));
        }
    }
}
