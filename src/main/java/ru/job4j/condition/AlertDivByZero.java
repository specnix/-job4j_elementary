package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(0);
        possibleDiv(10);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative number: " + number);
            }
        if (number == 0) {
            System.out.println("It's zero: " + number);
            }
    }
}