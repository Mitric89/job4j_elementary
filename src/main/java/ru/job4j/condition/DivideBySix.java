package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        if (isEven(number) && isDividesBy3(number)) {
            result = "The number divides by 6.";
        } else if (isDividesBy3(number)) {
            result = "The number divides by 3, but it isn't the even number.";
        } else if (isEven(number)) {
            result = "The number doesn't divide by 3, but it is the even number.";
        } else {
            result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isDividesBy3(int number) {
        return number % 3 == 0;
    }
}
