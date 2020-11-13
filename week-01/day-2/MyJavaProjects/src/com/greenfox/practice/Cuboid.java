package com.greenfox.practice;

public class Cuboid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000

        double longSide = 2.5;
        double widthSide = 3.5;
        double heightSide = 4.5;

        double size1 = ((longSide * widthSide) + (longSide * heightSide) + (widthSide * heightSide)) * 2;
        double size2 = longSide * widthSide *heightSide;

        System.out.println("Felület: " + size1);
        System.out.println("Térfogat: " + size2);
    }
}