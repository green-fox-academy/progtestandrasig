package com.greenfox.practice.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        // A Szaturnusz hiányzik a bolygók listájából.
        // Rakd be a megfelelő helyre
        // Készíts egy függvényt `putSaturn()` mely bemeneti paraméterként
        // egy listát vár. Visszatérési értéke pedig a helyes lista.

        System.out.println(putSaturn(planetList));
        // Várt eredmény: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }

    private static ArrayList<String> putSaturn(ArrayList<String> planetList) {

        planetList.add(planetList.indexOf("Jupiter") + 1, "Saturn");
        return planetList;
    }
}