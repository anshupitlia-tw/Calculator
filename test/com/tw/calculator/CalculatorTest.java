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
    public void shouldReturnResultSevenIfItFiveIsAddedToNumberTwoWhichWasAddedEarlier() {
        Calculator calculator = new Calculator();
        calculator.add(2.0);

        assertEquals(7.0, calculator.add(5.0), 0.0001);
    }

    @Test
    public void shouldReturnZeroIfZeroIsSubtractedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.subtract(0.0), 0.0001);
    }

    @Test
    public void shouldReturnNegativeSelfNumberIfANumberIsSubtractedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(-5.0, calculator.subtract(5.0), 0.0001);
    }

    @Test
    public void shouldReturnTwoIfFiveIsSubtractedAfterSevenWasAdded() {
        Calculator calculator = new Calculator();
        calculator.add(7.0);

        assertEquals(2.0, calculator.subtract(5.0), 0.0001);
    }

    @Test
    public void shouldReturnNegativeSevenIfFiveIsSubtractedAfterTwoWasSubtracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2.0);

        assertEquals(-7.0, calculator.subtract(5.0), 0.0001);
    }

    @Test
    public void shouldReturnZeroWhenZeroIsMultipliedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.multiply(0.0), 0.0001);
    }

    @Test
    public void shouldReturnTheNumberItselfIfOneIsMultipliedToAnyNumberSatisfyingMultiplicativeIdentity() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(5.0, calculator.multiply(1.0), 0.0001);
    }

    @Test
    public void shouldReturnFifteenIfThreeIsMultipliedToFive() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(15.0, calculator.multiply(3.0), 0.0001);
    }

    @Test
    public void shouldReturnTenIfTwoIsMultipliedToMultiplicationOfFiveAndOne() {
        Calculator calculator = new Calculator();
        calculator.add(1.0);
        calculator.multiply(5.0);

        assertEquals(10.0, calculator.multiply(2.0), 0.0001);
    }

    @Test
    public void shouldReturnNotANumberIfZeroDividesInitially() {
        Calculator calculator = new Calculator();

        assertEquals(Double.NaN, calculator.divide(0.0), 0.0001);
    }

    @Test
    public void shouldReturnTheNumberItselfIfOneDividesAnyNumber() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(5.0, calculator.divide(1.0), 0.0001);
    }

    @Test
    public void shouldReturnOneIfNumberDividesItself() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(1.0, calculator.divide(5.0), 0.0001);
    }

    @Test
    public void shouldReturnTwoIfFiveDividesTen() {
        Calculator calculator = new Calculator();
        calculator.add(10.0);

        assertEquals(2.0, calculator.divide(5.0), 0.0001);
    }

    @Test
    public void shouldReturnTwoIfFiveDividesTenWhichIsObtainedOnDividingTwentyByTwo() {
        Calculator calculator = new Calculator();
        calculator.add(20.0);
        calculator.divide(2.0);

        assertEquals(2.0, calculator.divide(5.0), 0.0001);
    }

    @Test
    public void shouldReturnNotANumberIfANumberIsAddedToNotANumberObtainedOnDividingByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(0.0);

        assertEquals(Double.NaN, calculator.add(4.0), 0.0001);
    }

    @Test
    public void shouldReturnZeroIfOperationsAreCancelled() {
        Calculator calculator = new Calculator();
        calculator.cancel();

        assertEquals(0.0, calculator.cancel(), 0.0001);
    }

    @Test
    public void shouldReturnTheNumberIfTheNumberIsAddedAfterOperationsAreCancelled() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);
        calculator.cancel();

        assertEquals(5.0, calculator.add(5.0), 0.0001);
    }

    @Test
    public void shouldReturnTrueIfApplicationIsAbleToExit() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(true, calculator.exit());

    }
}
