package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int counter = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            counter++;
        }
        return counter;
    }
}
