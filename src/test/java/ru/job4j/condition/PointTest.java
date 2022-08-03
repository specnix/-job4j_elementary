package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when25to26then1() {
        int x1 = 2;
        int x2 = 5;
        int y1 = 2;
        int y2 = 6;
        double expected = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1533to1236then4() {
        int x1 = 15;
        int x2 = 33;
        int y1 = 12;
        int y2 = 36;
        double expected = 4.24;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15303to12360then57() {
        int x1 = 15;
        int x2 = 303;
        int y1 = 12;
        int y2 = 360;
        double expected = 57.07;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}