package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        question.nextLine();
        int answer = new Random().nextInt(3);
        String value = switch (answer) {
            case 0 -> "Дa";
            case 1 -> "Нет";
            default -> "Может быть";
        };
        System.out.println(value);
    }
}
