package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double menHeight = 187.5;
        double man = manWeight(menHeight);
        double womanHeight = 163;
        double woman = womanWeight(womanHeight);
        System.out.printf("Man " + menHeight + " is " + "%.2f%n", man);
        System.out.printf("Woman " + womanHeight + " is " + "%.2f%n", woman);
    }
}
