package com.greenfox.practice;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name?: ");

        String yourName = scanner.next();

        System.out.println("Hello, " + yourName + "!");
    }
}