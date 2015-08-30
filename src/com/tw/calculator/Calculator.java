package com.tw.calculator;

public class Calculator {
    private double number;

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
        return number = 0.0;
    }

    public boolean exit() {
        number = 0.0;
        return true;
    }
}
