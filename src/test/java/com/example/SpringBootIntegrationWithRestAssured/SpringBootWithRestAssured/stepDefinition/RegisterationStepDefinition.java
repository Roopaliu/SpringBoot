package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.stepDefinition;

import controller.ControllerClass;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterationStepDefinition {

    @Autowired
    ControllerClass controllerClass;
    @Given("the user initiates the registration")
    public void theUserInitiatesTheRegistration() {
        System.out.println("Inside Step def");
        controllerClass.getUserName();

    }
}
