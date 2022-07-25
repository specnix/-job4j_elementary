package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double x = (height - 100) * 1.15;
        return x;
    }

    public static double womanWeight(short height) {
        double x = (height - 110) * 1.15;
        return x;
    }

    public static void main(String[] args) {
        short heightMen = 175;
        double man = Fit.manWeight(heightMen);
        System.out.println("Ваш идеальный мужской вес составляет " + man);
        short heightWoman = 175;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Ваш идеальный женский вес составляет " + woman);
    }
}