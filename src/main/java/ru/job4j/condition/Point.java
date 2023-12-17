package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2)) + Math.sqrt(Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        int x1 = 23;
        int y1 = 1;
        int x2 = 4;
        int y2 = 15;

        double result = distance(x1, y1, x2, y2);
        System.out.println("Distance between " + "(" + x1 + ";" + y1 + ") and (" + x2 + ";" + y2 + ") is " + result);
    }
}
