package com.example.springboottestCI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    
    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }
}
