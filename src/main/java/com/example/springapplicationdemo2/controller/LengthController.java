package com.example.springapplicationdemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthController {

    @GetMapping("/name-length")
    public Integer isNumberPrime(@RequestParam("name") String name) {

        return name.length();

    }
}
