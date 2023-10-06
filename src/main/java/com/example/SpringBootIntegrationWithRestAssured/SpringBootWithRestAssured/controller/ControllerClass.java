package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerClass {


    public void getUserName(){
        System.out.println("Inside controller");
    }


    @GetMapping("")
    public void getfirst(){

    }
}
