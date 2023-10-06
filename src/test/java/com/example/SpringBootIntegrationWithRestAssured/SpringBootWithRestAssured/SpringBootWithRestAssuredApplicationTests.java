package com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured;

import com.example.SpringBootIntegrationWithRestAssured.SpringBootWithRestAssured.Response.GetReqres;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {SpringBootWithRestAssuredApplication.class, CucumberIntegrationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootWithRestAssuredApplicationTests {

    @Autowired
    TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;
	@Test
	void getReqres() {
        //Arrange
        final String baseUrl = "https://reqres.in/api/users?page=1/";

        //Act
        var responseEntity = this.testRestTemplate.getForObject(baseUrl, GetReqres.class);
        System.out.println(GetReqres.class.toString());
        //Assert
        System.out.println(responseEntity.data.get(0).email.toString());




//        assertThat(responseEntity).isEqualTo("");
	}

}
