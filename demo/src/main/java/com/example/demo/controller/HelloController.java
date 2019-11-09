package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")//상위루트경로
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello, Spring!";
    }

}
