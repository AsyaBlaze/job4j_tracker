package ru.job4j.tracker.actions;

import ru.job4j.tracker.streams.Input;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
