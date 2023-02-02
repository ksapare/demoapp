package com.example.test.demoapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(String name){
        return "Hello World of Railways";
    }
}
