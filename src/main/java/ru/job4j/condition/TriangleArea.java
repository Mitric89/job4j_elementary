package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double result = area(a, b, c);
        System.out.printf("Square of triangle with sides " + a + ", " + b + ", " + c + " is %.2f%n", result);
    }
}
