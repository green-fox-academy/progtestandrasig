package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrueJosephusProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg, hány öngyilkos katona van a csoportban! ");
        int soldiers = scanner.nextInt();

        System.out.println("\nJosephus's Number is the: " + trueJosephusNumber(soldiers));
    }

    private static int trueJosephusNumber(int soldiers) {

        List<Integer> soldiersWhoesLive = new ArrayList<>();
        for (int i = 1; i <= soldiers; i++) {
            soldiersWhoesLive.add(i);
        }

        int firstOrNotFirstSoldierBegins = 1;   //Ha az első katonával kezdődik az adott kör (vagyis az első katona az első, attól a katonától számítva aki előtte lett öngyilkos!), akkor sz értéke 1, egyébként 0.

        while (soldiersWhoesLive.size() > 1) {

            boolean oddNumberOfSoldiers = soldiersWhoesLive.size() % 2 == 1;

            for (int i = soldiersWhoesLive.size() - 1; i >= 0 ; i--) {

                if (firstOrNotFirstSoldierBegins == 1 && i % 2 == 1)
                    soldiersWhoesLive.remove(i);
                else if (firstOrNotFirstSoldierBegins == 0 && i % 2 == 0)
                    soldiersWhoesLive.remove(i);
            }

            if (oddNumberOfSoldiers)
                firstOrNotFirstSoldierBegins = Math.abs(firstOrNotFirstSoldierBegins - 1);
        }

        return soldiersWhoesLive.get(0);
    }
}