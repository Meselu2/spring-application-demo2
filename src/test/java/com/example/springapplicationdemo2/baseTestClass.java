package com.example.springapplicationdemo2;

import com.example.springapplicationdemo2.controller.LengthController;
import org.junit.jupiter.api.BeforeEach;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class baseTestClass {


    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new LengthController());
    }
}