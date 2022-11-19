package com.helsinki.algorithm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helsinki.algorithm.pathFinders.dijkstras.ShortestPath;

import org.json.simple.JSONObject;

@RestController()
@RequestMapping("/data")
public class DataController {

    @PostMapping("/get")
    public JSONObject test(@RequestBody String body) {
        System.out.println(body);
        ShortestPath.graphTest();

        JSONObject file = new JSONObject();
        file.put("Full Name", "Ritu Sharma");

        return file;
    }

    public void graphMaker() {

    }
}
