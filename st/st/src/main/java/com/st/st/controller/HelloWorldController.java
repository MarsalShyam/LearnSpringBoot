package com.st.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //Http Get Request
    @GetMapping("/hello-world")
    public String helloword(){
        return "helloWorld ram!";
    }
}
