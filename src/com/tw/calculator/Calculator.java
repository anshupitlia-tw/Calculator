package com.tw.calculator;

public class Calculator {
    private double number;
    private static double INITIAL_NUMBER = 0.0;

    public double add(double addend) {
        return number = number + addend;
    }

    public double subtract(double subtrahend) {
        return number = number - subtrahend;
    }

    public double multiply(double factor) {
        return number = number * factor;
    }

    public double divide(double dividend) {
        return number = number / dividend;
    }

    public double cancel() {
        return number = INITIAL_NUMBER;
    }

    public boolean exit() {
        number = INITIAL_NUMBER;
        return true;
    }

    public boolean isSupported(String operation) {
        return true;
    }
}
