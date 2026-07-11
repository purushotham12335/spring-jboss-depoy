package com.jboss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/gethome")
    public String getHome() {
        return "Welcome Home";
    }
    @GetMapping("/gethome1")
    public String getHome1() {
        return "Welcome Home1";
    }
}