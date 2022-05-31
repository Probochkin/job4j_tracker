package ru.job4j.opp;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void whenPointa00Pointb02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenPointa000Pointb002PointThen2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 0);
        double expected = 2;
        assertThat(expected, is(a.distance3d(b)));
    }
}