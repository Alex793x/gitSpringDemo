package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/")
    public String test() {
        return "Test It Up";
    }

    // Comment
}
