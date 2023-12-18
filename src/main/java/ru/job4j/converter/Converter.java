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

        float inputRuble = 420;
        float inputDollar = 420;
        float inputEuro = 420;

        float expectedEurosFromRubles = 6;
        float outputEurosFromRubles = rubleToEuro(inputRuble);
        boolean passedEurosFromRubles = expectedEurosFromRubles == outputEurosFromRubles;
        System.out.println(inputRuble + " rubles are " + outputEurosFromRubles + " euros. Test result: " + passedEurosFromRubles);
        float expectedDollarsFromRubles = 7;
        float outputDollarsFromRubles = rubleToDollar(inputRuble);
        boolean passedDollarsFromRubles = expectedDollarsFromRubles == outputDollarsFromRubles;
        System.out.println(inputRuble + " rubles are " + outputDollarsFromRubles + " dollars. Test result: " + passedDollarsFromRubles);
        float expectedRublesFromDollars = 25200;
        float outputRublesFromDollars = dollarToRuble(inputDollar);
        boolean passedRublesFromDollars = expectedRublesFromDollars == outputRublesFromDollars;
        System.out.println(inputDollar + " dollars are " + outputRublesFromDollars + " rubles. Test result: " + passedRublesFromDollars);
        float expectedRublesFromEuros = 29400;
        float outputRublesFromEuros = euroToRuble(inputEuro);
        boolean passedRublesFromEuros = expectedRublesFromEuros == outputRublesFromEuros;
        System.out.println(inputEuro + " euros are " + outputRublesFromEuros + " rubles. Test result: " + passedRublesFromEuros);
        float expectedDollarsFromEuros = 490;
        float outputDollarsFromEuros = euroToDollar(inputEuro);
        boolean passedDollarsFromEuros = expectedDollarsFromEuros == outputDollarsFromEuros;
        System.out.println(inputEuro + " euros are " + outputDollarsFromEuros + " dollars. Test result: " + passedDollarsFromEuros);
        float expectedEurosFromDollars = 360;
        float outputEurosFromDollars = dollarToEuro(inputDollar);
        boolean passedEurosFromDollars = expectedEurosFromDollars == outputEurosFromDollars;
        System.out.println(inputDollar + " dollars are " + outputEurosFromDollars + " euros. Test result: " + passedEurosFromDollars);
    }
}
