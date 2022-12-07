package ru.job4j.poly.trans;

public class PolyUse {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] transport = new Vehicle[]{airplane, bus, train};
        for (Vehicle a : transport) {
            a.move();
        }
    }
}
