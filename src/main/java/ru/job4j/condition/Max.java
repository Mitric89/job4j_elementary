package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(max(left, middle), right);
    }

    public static int max(int left, int midLeft, int midRight, int right) {
        return max(max(left, midLeft, midRight), right);
    }
}
