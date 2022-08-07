package ru.job4j.condition;

public class Max {
    public  static int comparison(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.comparison(7, 5);
        System.out.println("Ответ: " + result + " максимальное ");
    }
}