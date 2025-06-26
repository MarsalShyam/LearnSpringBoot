package com.ThymeLeaf.ThymeLeafLearn.controller;

import com.ThymeLeaf.ThymeLeafLearn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //handle method To handle the variable-expression request
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user=new User("shyam","shyam@gmail.com","Admin","Male");
        model.addAttribute("User",user);
        return "variable-expression";
    }

    //handle method to handle the Selection Expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user=new User("Ram","Ram@gmail.com","Student","Male");
        model.addAttribute("user",user);
        return "selection-expression";
    }
}
