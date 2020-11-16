package com.greenfox.practice.day4;

import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Készíts egy egyszerű számológépet ami beolvassa a paramétereket a parancssorból és kiírja azokat.
        // A függvény neve legyen "calculate()" és támogassa a következő műveleteket:
        // +, -, *, /, %
        // két számmal.
        // A formátum legyen a következő: {művelet} {szám1} {szám2}.
        // Példák: "+ 3 3" (eredmény 6) vagy "* 4 4" (eredmény 16)

        // Használd a Scanner osztályt
        // Folyamat:

        // A program elindul
        // A program kiírja: "Please type in the expression:"
        // Várakozás a felhasználói input-ra
        // A program kiírja az eredményt
        // Kilépés


        System.out.println("\t\t = " + calculate());
    }

    private static int calculate() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type in the expression:\n");

        String expression = scanner.nextLine();
        String[] expressionArray = expression.split(" ");

        int operand1 = Integer.parseInt(expressionArray[1]);
        int operand2 = Integer.parseInt(expressionArray[2]);

        int eredmeny;

        switch (expressionArray[0]) {
            case "+": eredmeny = operand1 + operand2; break;
            case "-": eredmeny = operand1 - operand2; break;
            case "*": eredmeny = operand1 * operand2; break;
            case "/": eredmeny = operand1 / operand2; break;
            case "%": eredmeny = operand1 % operand2; break;
            default: eredmeny = -1;
        };

        return eredmeny;
    }
}