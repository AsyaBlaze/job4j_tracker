package ru.job4j.oop.kolobok;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Kolobok was eaten. The story over");
        } else {
            System.out.println("Kolobok run away");
        }
    }

}
