package ru.job4j.opp;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second,  third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, max(second,  third)));
    }
    }