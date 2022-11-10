package com.helsinki.algorithm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

@RestController()
@RequestMapping("/data")
public class TestController {

    @GetMapping("/get")
    public JSONObject add() {

        JSONObject file = new JSONObject();
        file.put("Full Name", "Ritu Sharma");

        return file;
    }
}
