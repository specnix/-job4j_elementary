package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenK2P6Then0() {
        double k = 2;
        int p = 6;
        double expected = 0.12;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenK5P10Then0() {
        double k = 5;
        int p = 10;
        double expected = 0.51;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenK5P22Then0() {
        double k = 5;
        int p = 22;
        double expected = 0.25;
        double out = SqArea.square(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }
}