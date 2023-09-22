package ru.job4j.collection;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int leftNum = Integer.parseInt(left.split("\\.")[0]);
        int rightNum = Integer.parseInt(right.split("\\.")[0]);
        return Integer.compare(leftNum, rightNum);
    }
}