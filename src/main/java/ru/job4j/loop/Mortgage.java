package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int counter = 0;
        while (amount > 0) {
            amount += amount * percent / 100 - salary;
            counter++;
        }
        return counter;
    }
}
