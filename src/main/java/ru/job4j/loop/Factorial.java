package ru.job4j.loop;

public class Factorial {
    public static int calc(int number) {
        int result = 1;
        if (number == 0 || number == 1) {
            return result;
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}