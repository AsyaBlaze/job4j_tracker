package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

public class CardsCreator {
    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        List<Card> deck = Stream.of(suits)
                .flatMap(suit -> Stream.of(values)
                        .map(value -> new Card(suit, value)))
                .toList();
        System.out.println(deck);
    }
}
