package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculate(Double value1, Double value2, String ops) {
        switch (ops) {
            case "add":
                return value1 + " + " + value2 + " is " + (value1 + value2);
            case "sub":
                return value1 + " - " + value2 + " is " + (value1 - value2);
            case "multiply":
                return value1 + " * " + value2 + " is " + (value1 * value2);
            case "divide":
                if (value2 == 0) {
                    return "zero can't be divided";
                } else {
                    return value1 + " / " + value2 + " is " + (value1 / value2);
                }
            default:
                return "Invalid operation";
        }

    }
}
