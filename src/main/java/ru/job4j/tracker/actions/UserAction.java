package ru.job4j.tracker.actions;

import ru.job4j.tracker.streams.Input;
import ru.job4j.tracker.Tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
