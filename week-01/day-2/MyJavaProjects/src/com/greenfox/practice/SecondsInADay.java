package com.greenfox.practice;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 24;
        int currentSeconds = 34;

        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        int secondsOfADay = 24 * 60 * 60;   // = 24hours * 60minutes * 60seconds

        int secondsOfCurrentTime = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;

        System.out.println("Seconds are left: " + (secondsOfADay - secondsOfCurrentTime));
    }
}