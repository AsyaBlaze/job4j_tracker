package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenSquareFunction() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(1, 5, x -> x * x + 2);
        List<Double> expected = Arrays.asList(3D, 6D, 11D, 18D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenDegreeFunction() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(1, 4, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(1D, 4D, 27D);
        assertThat(result).containsAll(expected);
    }
}