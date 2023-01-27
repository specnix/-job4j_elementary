package ru.job4j.array;

public class MatrixSum {
    public  static void find(int[][] array, int el) {
        System.out.println("Find el : " + el);
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val == el) {
                    System.out.println("row : " + row + ", cell : " + cell);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixSum.find(array, 3);
    }
}