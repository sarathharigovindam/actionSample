package com.example.GHaction_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @GetMapping
    public Object hello(){
        Map<String,String> object= new HashMap<>();
        object.put("Title","Hackathon POC by Strikers");
        return object;
    }
}
