package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return max(one, two) > three ? max(one, two) : three;
    }

    public static int max(int one, int two, int three, int four) {
        int maximum = max(one, two, three);
        return maximum > four ? maximum : four;
    }

    public static void main(String[] args) {
        int rsl = max(4, 3);
        System.out.println("Наибольшее число: " + rsl);
    }
}
