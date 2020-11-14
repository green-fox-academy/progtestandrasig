package com.greenfox.practice.day3;

public class ColorsMatrix {
    public static void main(String[] args) {
        // - Készíts egy kétdimenziós tömböt
        //   ami megadott színek különböző árnyalatait tartalmazza
        // - A `colors[0]` a zöld árnyalatait tárolja:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - A `colors[1]` a piros árnyalatait:
        //   `"orange red", "red", "tomato"`
        // - A `colors[2]` pedig a pink árnyalatait:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[][] colorMatrix = new String[3][];

        colorMatrix[0] = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
        colorMatrix[1] = new String[] {"orange red", "red", "tomato"};
        colorMatrix[2] = new String[] {"orchid", "violet", "pink", "hot pink"};

        //Kiíratás (ellenőrzéshez):
        for (int i = 0; i < colorMatrix.length; i++) {
            for (int j = 0; j < colorMatrix[i].length; j++) {
                System.out.print(colorMatrix[i][j] + (j < colorMatrix[i].length - 1 ? ", ": ""));
            }
            System.out.println();
        }
    }
}
