package com.ThymeLeaf.ThymeLeafLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //Handler Method To handle **hellowWorld Requesh**
    //http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message","hii shyam");
        return "hello-world";
    }
}
