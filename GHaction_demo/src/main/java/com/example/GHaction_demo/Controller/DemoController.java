package com.example.GHaction_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @GetMapping
    public String demo(){
        String var="Hackathon POC by Strikers(System Team)";
        return var;
    }
}
