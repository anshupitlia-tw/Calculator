package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroIfZeroIsAddedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.add(0.0), 0.0001);
    }

    @Test
    public void shouldReturnTheNumberToBeAddedIfItIsAddedInitiallySatisfyingTheAdditiveIdentityProperty() {
        Calculator calculator = new Calculator();

        assertEquals(5.0, calculator.add(5.0), 0.0001);
    }

    @Test
    public void shouldReturnResultSevenIfItFiveIsAddedToNumberTwo() {
        Calculator calculator = new Calculator();
        calculator.add(2.0);

        assertEquals(7.0, calculator.add(5.0), 0.0001);
    }
}
