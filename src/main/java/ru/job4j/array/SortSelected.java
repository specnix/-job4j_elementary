package ru.job4j.array;

import static ru.job4j.array.SwitchArray.swap;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int left = 0; left < data.length - 1; left++) {
                int min = MinDiapason.findMin(data, left, data.length - 1);
                int index = FindLoop.indexInRange(data, min, left, data.length - 1);
                swap(data, left, index);

            }
        return data;
    }
}