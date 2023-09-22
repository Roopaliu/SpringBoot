package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(classes = {SpringBootWithRestAssuredApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberOptions(
        tags  = "@FirstTest",
        features =  "src.test.resources.com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured",
        glue = {"com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured"},
        plugin = {"pretty"}
)
public class CucumberIntegrationTest {
}
