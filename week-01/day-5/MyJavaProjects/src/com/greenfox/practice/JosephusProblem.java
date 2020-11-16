package com.greenfox.practice.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg, hány öngyilkos katona van a csoportban! ");
        int soldiers = scanner.nextInt();

        System.out.println("\nJosephus's Number is the: " + whatIsJosephusNumber(soldiers));
    }

    private static int whatIsJosephusNumber(int soldiers) {

        List<Integer> soldiersWhoesLife = new ArrayList<>();

        for (int i = 1; i <= soldiers; i++) {
            soldiersWhoesLife.add(i);
        }

        int index = 1;
        //int soldier;
        while (soldiersWhoesLife.size() > 1) {

            if (soldiersWhoesLife.size() > 2) {

                if (index + 2 <= soldiersWhoesLife.size()) index += 2;
                else index = 3 + (index - soldiersWhoesLife.size() - 1);
            }
            else index = index % 2 == 1 ? 1 : 2;

            //soldier =
            soldiersWhoesLife.remove(index - 1);

            //System.out.print(soldier + " ");
        }

        return soldiersWhoesLife.get(0);
    }
}