package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Integer.min(left.length(), right.length()); i++) {
            if (left.charAt(i) > right.charAt(i)) {
                return 1;
            } else if (left.charAt(i) < right.charAt(i)) {
                return -1;
            }
        }
        return left.length() - right.length();
    }
}
