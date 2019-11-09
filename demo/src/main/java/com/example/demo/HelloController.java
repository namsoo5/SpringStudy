package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello, Spring!";
    }

    //get /sum/?num=[]&num2=[]
    @GetMapping("/sum")
    public int Sum(@RequestParam("num1") int a, @RequestParam("num2") int b){

        return a+b;

    }

    @GetMapping("/multi")
    public int Mutli(@RequestParam("num1") int a, @RequestParam("num2") int b){

        return a*b;

    }

    @GetMapping("/div")
    public float Div(@RequestParam("num1") int a, @RequestParam("num2") int b){

        return (float)a/b;

    }

    @GetMapping("/sub")
    public int Sub(@RequestParam("num1") int a, @RequestParam("num2") int b){

        return a-b;

    }
}
