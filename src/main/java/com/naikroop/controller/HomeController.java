package com.naikroop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")

public class HomeController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String home(){
        System.out.println("home controller called");
        return "Welcome to Home";
    }
}
