package ru.job4j.array;

import static ru.job4j.array.SwitchArray.swap;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
                int min = MinDiapason.findMin(data, i, data.length - 1);
                int index = FindLoop.indexInRange(data, min, i, data.length - 1);
                swap(data, i, index);
       }
        return data;
    }
}