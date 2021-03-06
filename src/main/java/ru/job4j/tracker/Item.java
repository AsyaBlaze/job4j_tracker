package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private static LocalDateTime created;

    public Item() {
        created = LocalDateTime.now();
    }

    public Item(String name) {
        this.name = name;
        created = LocalDateTime.now();
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
        created = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return created;
    }

    public void setName(String name) {
        this.name = name;
    }
}