package com.example.calculator.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class CalculatorService {

    public String calculate(Integer value1, Integer value2, String ops) {
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
