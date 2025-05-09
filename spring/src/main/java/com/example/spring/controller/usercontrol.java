package com.example.spring.controller;

import com.example.spring.dto.UserData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
public class usercontrol {
    Integer counter = 0;

    @GetMapping("/home")
    public String home() {
        return "welcome";
    }

    @GetMapping("/getcounter")
    public ResponseEntity getCounter() {
        return new ResponseEntity(counter, HttpStatus.OK);
    }

    @GetMapping("/increasecounter")
    public void increaseCounter() {
        counter++;
    }

    @PostMapping("/post")
    public String update(@RequestBody UserData name) {
        return "My name is:" + name;
    }

    @PutMapping("/update")
    public String updateData(@RequestBody String Data1) {

        return "Data : " + Data1;
    }


}
