package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double sumPercent = (amount * percent) / 100;
        double creditSize = amount + sumPercent;
        while (creditSize > 0) {
            double creditResidue = creditSize - salary;
            creditSize = ((creditResidue * percent) / 100) + creditResidue;
            year++;
        }
        return year;
    }
}