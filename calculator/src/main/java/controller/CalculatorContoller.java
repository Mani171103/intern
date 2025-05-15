package com.example.calculator.controller;


import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorContoller {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/operation")
    public ResponseEntity<String> Operation(@RequestParam(required = false) String value1,
            @RequestParam(required = false) String value2,@RequestParam(required = false) String ops)
    {
        if (value1 == null || value2 == null || ops == null)
        {

            return new ResponseEntity<String>("Provide valid data", HttpStatus.BAD_REQUEST);
        }
        Integer val1 = Integer.parseInt(value1);
        Integer val2 = Integer.parseInt(value2);

        String result = calculatorService.calculate(val1, val2, ops);
        if (result.equals("Invalid operation") || result.equals("Cannot divide by zero"))
        {
            return new ResponseEntity<String>("Please provide valid data", HttpStatus.BAD_REQUEST);
        }
        else
        return ResponseEntity.ok(result);
    }
}
