package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Dmitry";
        names[1] = "Ivan";
        names[2] = "Alex";
        names[3] = "Nikita";
        System.out.println("Length of array \"ages\" is " + ages.length);
        System.out.println("Length of array \"surnames\" is " + surnames.length);
        System.out.println("Length of array \"prices\" is " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
