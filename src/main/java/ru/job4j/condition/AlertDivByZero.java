package ru.job4j.condition;

public class AlertDivByZero {

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        } else if (number < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("Valid number");
        }
    }

    public static void main(String[] args) {
        checkNumber(4);
        checkNumber(0);
        checkNumber(-10);
    }
}
