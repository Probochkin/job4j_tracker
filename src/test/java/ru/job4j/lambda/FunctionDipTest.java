package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class FunctionDipTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDip.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults() {
        List<Double> result = FunctionDip.diapason(2, 6, x -> Math.pow(x, 2) - 2);
        List<Double> expected = Arrays.asList(2D, 7D, 14D, 23D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenExponentialResults() {
        List<Double> result = FunctionDip.diapason(1, 3, x -> Math.pow(4, x) - 2);
        List<Double> expected = Arrays.asList(2D, 14D);
        assertThat(result, is(expected));
    }
}