package com.greenfox.practice;

public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        int numberOfWeeks = 17;
        int numberOfDaysPerWeek = 5;

        int numberOfProgrammingsHoursPerDay = 6;
        int numberOfWorkHoursPerWeek = 52;

        int fullProgrammingHours = numberOfWeeks * numberOfDaysPerWeek * numberOfProgrammingsHoursPerDay;
        int fullWorkHours = numberOfWeeks * numberOfWorkHoursPerWeek;

        System.out.println("Full programmings hours = " + fullProgrammingHours);
        System.out.println("Percent of programmings hours = " + (fullProgrammingHours / (fullWorkHours / 100.0)) + "%");
    }
}