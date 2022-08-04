package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean rsl1 = first > second;
        boolean rsl2 = first < second;
        boolean rsl3 = first == second;
        System.out.println("first больше second: " + rsl1);
        System.out.println("first меньше second: " + rsl2);
        System.out.println("first равна second: " + rsl3);
    }
}
