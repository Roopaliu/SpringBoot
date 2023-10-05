package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.glue;

import com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.Response.GetReqres;
import com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.controller.ControllerClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;

public class RegisterationStepDefinition {

    @Autowired
    ControllerClass controllerClass;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private static  final String root = "https://localhost:53891/";


    @Given("the user initiates the registration")
    public void theUserInitiatesTheRegistration() {
        System.out.println("Inside Step def");
        controllerClass.getUserName();

    }

    @When("the user authenticates")
    public void theUserAuthenticates() throws JsonProcessingException {
        System.out.println("Inside 2nd step");
//        objectMapper.readValue(testRestTemplate.exchange("/api/users?page=2", HttpMethod.GET, null, String.class).getBody(), GetReqres.class);


    }
}
