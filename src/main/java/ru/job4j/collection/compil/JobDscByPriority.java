package ru.job4j.collection.compil;

import java.util.Comparator;

public class JobDscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
