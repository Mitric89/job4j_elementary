package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                min = array[i];
            }
        }
        return min;
    }
}
