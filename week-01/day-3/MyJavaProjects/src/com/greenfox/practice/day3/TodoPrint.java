package com.greenfox.practice.day3;

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        int length = todoText.length();

        todoText = "My todo:\n" + todoText + " - Download games\n     - Diablo";

        System.out.println(todoText);
    }
}