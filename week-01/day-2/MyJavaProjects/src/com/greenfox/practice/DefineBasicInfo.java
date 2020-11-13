package com.greenfox.practice;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)

        String name = "Andrási Gábor";
        int age = 39;
        double height = 1.81;
        boolean married = false;

        System.out.println(name + " " + age + "years " + height + "m " + married);
    }
}