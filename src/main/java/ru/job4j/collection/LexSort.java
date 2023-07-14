package ru.job4j.collection;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        Pattern pattern = Pattern.compile("(\\d+)\\. \\w+\\.?");
        Matcher matcherL = pattern.matcher(left);
        Matcher matcherR = pattern.matcher(right);
        matcherL.find();
        matcherR.find();
        int leftNum = Integer.parseInt(matcherL.group(1));
        int rightNum = Integer.parseInt(matcherR.group(1));
        return Integer.compare(leftNum, rightNum);
    }
}