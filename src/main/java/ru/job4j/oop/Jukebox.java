package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже, пешеходы по лужам, а вода по асфальту рекой...");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят. Одеяла и подушки ждут ребят...");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox botton = new Jukebox();
        botton.music(1);
        botton.music(2);
        botton.music(3);
    }
}
