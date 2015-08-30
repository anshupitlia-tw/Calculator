package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroIfZeroIsAddedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.add(0.0), 0.0001);
    }
}
