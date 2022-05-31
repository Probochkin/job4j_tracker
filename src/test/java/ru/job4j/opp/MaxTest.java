package ru.job4j.opp;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int first = 4;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int first = 3;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To10To8Then10() {
        int first = 4;
        int second = 10;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To10To8To12Then10() {
        int first = 4;
        int second = 10;
        int third = 8;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}