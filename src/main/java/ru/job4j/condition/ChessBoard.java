package ru.job4j.condition;

import java.math.MathContext;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
                if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                    rsl = Math.abs(x2 - x1);
                    rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(way(0, 0, 7, 7));
        System.out.println(way(0, 0, 8, 8));
    }
}