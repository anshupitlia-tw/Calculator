package com.tw.calculator;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    private double number;
    private static double INITIAL_NUMBER = 0.0;
    private static List<String  > SUPPORTED_OPERATIONS = Arrays.asList(new String[]{"add", "subtract", "multiply", "divide", "cancel", "exit"});

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

    public void exit() {
        System.exit(0);
    }

    public boolean isSupported(String operation) {
        if (SUPPORTED_OPERATIONS.contains(operation))
            return true;
        return false;
    }

    public void displayResult() {
        System.out.print(number);
    }

    public void call(String command, double operand) {
        switch(command) {
            case "add":         add(operand);
                                displayResult();
                                break;
            case "subtract":    subtract(operand);
                                displayResult();
                                break;
            case "multiply":    multiply(operand);
                                displayResult();
                                break;
            case "divide":      divide(operand);
                                displayResult();
                                break;
            case "cancel":      cancel();
                                displayResult();
                                break;
            case "exit":        exit();
        }
    }
}
