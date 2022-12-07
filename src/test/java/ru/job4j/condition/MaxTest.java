package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To3To8Then8() {
        int one = 4;
        int two = 3;
        int three = 8;
        int result = Max.max(one, two, three);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To3To8To9Then9() {
        int one = 4;
        int two = 3;
        int three = 8;
        int four = 9;
        int result = Max.max(one, two, three, four);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}