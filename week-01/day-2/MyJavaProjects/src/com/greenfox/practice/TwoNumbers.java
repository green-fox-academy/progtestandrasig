package com.greenfox.practice;

public class TwoNumbers {
    public static void main(String[] args) {
        // Írj egy programot, ami kiírja pár számbéli operáció eredményét 22-vel és 13-mal

        int x = 13;
        int y = 22;

        // Írasd ki 13 és 22 összegét
        System.out.println("13 + 22 = " + (x + y));
        // Írasd ki 13 és 22 különbségét
        System.out.println("13 - 22 = " + (x - y));
        // Írasd ki 13 és 22 szorzatát
        System.out.println("13 * 22 = " + (x * y));
        // Írasd ki 22-őt osztva 13-mal művelet eredményét (törtszám)
        System.out.println("22 / 13 = " + ((double)y / x));
        // Írasd ki egész számként a 22 osztva 13-mal művelet eredményét
        System.out.println("22 / 13 = " + (y / x));
        // Írasd ki 22-őt osztva 13-mal művelet osztási maradékát.
        System.out.println("22 % 13 = " + (y % x));
    }
}