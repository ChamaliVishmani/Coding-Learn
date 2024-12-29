package com.chamalidev.design_patterns.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${my.website.name}")
    private String myWebsiteName;

    @GetMapping("/")
    public String welcome(){
        return "Welcome to "+myWebsiteName;
    }
}
