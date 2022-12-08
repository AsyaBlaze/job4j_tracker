package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;

@SuppressWarnings("ALL")
public class PointTest {
    @Test
    public void whenPoints333And666Then5Point1() {
        Point a = new Point(3, 3, 3);
        Point b = new Point(6, 6, 6);
        double rsl = b.distance3d(a);
        assertThat(rsl, closeTo(5.1, 0.1));
    }

    @Test
    public void whenPoints000And666Then10Point3() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(6, 6, 6);
        double rsl = b.distance3d(a);
        assertThat(rsl, closeTo(10.3, 0.1));
    }
}