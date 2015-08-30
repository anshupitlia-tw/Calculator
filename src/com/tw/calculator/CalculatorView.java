package com.tw.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorView {
    static Calculator calculator = new Calculator();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;
        System.out.print(">");
        inputLine = br.readLine().toLowerCase();
        while(true) {
            separateCommandAndOperandAndCallCalculator(inputLine);
            System.out.println("");
            System.out.print(">");
            inputLine = br.readLine().toLowerCase();
        }
    }

    public static void separateCommandAndOperandAndCallCalculator(String inputLine) {
        String command;
        Double operand = 0.0;
        try {
            String commandAndOperandArray[] = inputLine.split(" ");
            command = commandAndOperandArray[0];
            try {
                operand = Double.parseDouble(commandAndOperandArray[1]);
            }
            catch(NumberFormatException nfe) {
                System.out.println("Error! Provide a valid number");
            }
        }
        catch(ArrayIndexOutOfBoundsException aioobe) {
            command = inputLine;
        }
        if (!(calculator.isSupported(command))){
            System.out.println("Unsupported Operation");
        }
        else
        {
            calculator.call(command, operand);
        }
    }
}
