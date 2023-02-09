package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        if (queue.isEmpty()) return null;
        int nowCount = count;
        while (nowCount > 1) {
            queue.poll();
            nowCount--;
        }
        return queue.poll().name();
    }

    public String getFirstUpsetCustomer() {
        if (queue.isEmpty()) return null;
        int nowCount = count;
        while (nowCount > 0) {
            queue.poll();
            nowCount--;
        }
        return queue.poll().name();
    }
}
