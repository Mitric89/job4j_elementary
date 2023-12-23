package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first >= second && first >= third) {
            result = first;
        } else if (first >= second) {
            result = third;
        } else if (second >= third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}
