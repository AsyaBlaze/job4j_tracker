package ru.job4j.poly.trans;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по трассе");
    }
}
