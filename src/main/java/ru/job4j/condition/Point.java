package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = Math.pow(first, 2);
        double three = y2 - y1;
        double four = Math.pow(second, 2);
        double five = three + four;
        double result = Math.sqrt(five);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 5, 6, 7);
        System.out.println("Расстояние между точками в системе координат: " + result);
    }
}