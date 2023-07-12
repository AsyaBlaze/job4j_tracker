package ru.job4j.collection.compil;

import java.util.Comparator;

public class JobDscByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
