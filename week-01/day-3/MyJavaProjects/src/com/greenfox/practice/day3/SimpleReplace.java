package com.greenfox.practice.day3;

public class SimpleReplace {
    public static void main(String... args){
        String example = "In a dishwasher far far away";

        example.replace("dishwasher", "galaxy");
        // Ebben a feladatban szerettem volna a "dishwasher"-t "galaxy"-ra
        // helyettesíteni, de akadt kis problémám.
        // Kérlek javítsd meg nekem.
        // A várt eredmény: In a galaxy far far away

        example = example.replace("dishwasher", "galaxy");
        //example = example.replaceFirst("dishwasher", "galaxy");
        
        System.out.println(example);
    }
}