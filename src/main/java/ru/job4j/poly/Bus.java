package ru.job4j.poly;

import ru.job4j.poly.Transport;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Мы едем, едем, едем, едем");
    }

    @Override
    public void askPassangers(int passengers) {
        System.out.println("Мы едем, едем, едем, едем, вместе с " + passengers + " пассажирами");
    }

    @Override
    public int askRefuel(int refuel) {
        return refuel * 40;
    }
}
