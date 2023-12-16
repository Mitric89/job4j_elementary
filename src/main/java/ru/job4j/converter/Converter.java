package ru.job4j.converter;

public class Converter {
    static final float EURO_PER_RUBLE = 70f;
    static final float DOLLAR_PER_RUBLE = 60f;

    public static float rubleToEuro(float value) {
        return value / EURO_PER_RUBLE;
    }

    public static float rubleToDollar(float value) {
        return value / DOLLAR_PER_RUBLE;

    }

    public static float dollarToRuble(float value) {
        return value * DOLLAR_PER_RUBLE;
    }

    public static float euroToRuble(float value) {
        return value * EURO_PER_RUBLE;
    }

    public static float euroToDollar(float value) {
        float result = euroToRuble(value);
        result = rubleToDollar(result);
        return result;
    }

    public static float dollarToEuro(float value) {
         float result = dollarToRuble(value);
         result = rubleToEuro(result);
         return result;
    }

    public static void main(String[] args) {
        System.out.println(rubleToEuro(100));
        System.out.println(rubleToDollar(100));
        System.out.println(dollarToRuble(100));
        System.out.println(euroToRuble(100));
        System.out.println(euroToDollar(100));
        System.out.println(dollarToEuro(100));
    }
}
