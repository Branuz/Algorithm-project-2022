package com.helsinki.algorithm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class TestController {
    
    @PostMapping("/add")
    public String add() {

        return "Working";
    }
}
