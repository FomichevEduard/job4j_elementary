package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then89() {
        short in = 170;
        double expected = 89;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman167() {
        short in = 161;
        double expected = 58;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.8);

    }

    }

