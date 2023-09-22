package controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {


    public void getUserName(){
        System.out.println("Inside controller");
    }

}
