package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        MatcherAssert.assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void when00and50and90Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(9, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        MatcherAssert.assertThat(rsl, closeTo(-1, 0));
    }
}