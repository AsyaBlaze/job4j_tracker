package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("kazDirtyHands@bochka.ket", "Kaz Brak");
        map.put("kazDirtyHands@bochka.ket", "Kaz Brekker");
        map.put("ghost@bochka.ket", "Inej Deg");
        map.put("ghost@bochka.ket", "Inej Gafa");
        map.put("shootHeart@bochka.ket", "Jesper Fahi");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
