package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumSubtrAndDiv(double first, double second) {
        return subtraction(first, second)
                    + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма двух операций:" + sumSubtrAndDiv(10, 5));
        System.out.println("Сумма четырех операций: " + sumAll(10, 5));
    }
}