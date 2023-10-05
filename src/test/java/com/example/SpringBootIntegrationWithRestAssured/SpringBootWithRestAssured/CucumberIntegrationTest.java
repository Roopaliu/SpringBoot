package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@CucumberOptions(
        tags  = "@FirstTest",
        features =  "com/example/SpringBootIntegrationWithRestAssured/SpringBootWithRestAssured/feature",
        glue = {"com/example/SpringBootIntegrationWithRestAssured/SpringBootWithRestAssured"},
        plugin = {"pretty"}
)
public class CucumberIntegrationTest {
}
