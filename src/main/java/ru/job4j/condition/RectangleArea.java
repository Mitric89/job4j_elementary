package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = square(p, k);
        System.out.printf("Square of rectangle with perimeter = " + p + " and ratio = " + k + " is " + result);
    }
}
