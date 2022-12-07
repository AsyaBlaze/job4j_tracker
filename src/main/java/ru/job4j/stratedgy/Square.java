package ru.job4j.stratedgy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "_____________" + ln
                + "|           |" + ln
                + "|           |" + ln
                + "|           |" + ln
                + "|___________|" + ln;
    }
}
