package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to1010then0() {
        double expected = 0;
        int x1 = 10;
        int y1 = 10;
        int x2 = 10;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to2020then14() {
        double expected = 14.14;
        int x1 = 10;
        int y1 = 10;
        int x2 = 20;
        int y2 = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1020to2010then42() {
        double expected = 42.42;
        int x1 = -10;
        int y1 = 20;
        int x2 = 20;
        int y2 = -10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}