package com.example.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("")
    public String greet(HttpServletRequest request){
        return "Hello! Welcome to my Application. " + request.getSession().getId();
    }
}
