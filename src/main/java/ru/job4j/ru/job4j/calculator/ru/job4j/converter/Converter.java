package ru.job4j.ru.job4j.calculator.ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }
    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("Ваша сумма в евро: " + euro + '€');
        float dollar = Converter.rubleToDollar(120);
        System.out.println("Ваша сумма в долларах: " + dollar + '$');
    }
}
