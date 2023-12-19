package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDivide(double first, double second) {
        return substract(first, second)
                + divide(first, second);
    }

    public static double allOperationsSum(double first, double second) {
        return multiply(first, second)
                + divide(first, second)
                + sum(first, second)
                + substract(first, second);
    }

    public static void main(String[] args) {
        double first = 10;
        double second = 20;
        System.out.println("Result of \"sum + multiply\" of " + first + " and " + second + " is "
                + sumAndMultiply(first, second));
        System.out.println("Result of \"substract + divide\" of " + first + " and " + second + " is "
                + substractAndDivide(first, second));
        System.out.println("Result of the sum of operations on " + first + " and " + second + " is "
                + allOperationsSum(first, second));

    }
}
