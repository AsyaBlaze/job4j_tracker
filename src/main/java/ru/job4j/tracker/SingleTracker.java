package ru.job4j.tracker;

public final class SingleTracker {

    private static Tracker tracker = new Tracker();

    private static SingleTracker singleTracker = null;

    private SingleTracker() {
    }

    public static SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item1) {
        return tracker.add(item1);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] FindByName(String key) {
        return tracker.findByName(key);
    }

    public int indexOf(int id) {
        return tracker.indexOf(id);
    }

    public boolean replace(int id) {
        return tracker.replace(id, new Item();
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
