package ru.job4j.condition;

//сравнить два числа и получить максимальное из них

public class Max {
    public  static int comparison(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.comparison(7, 5);
        System.out.println("Ответ: " + result + " максимальное");
    }
}