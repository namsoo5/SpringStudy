package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")  //상위루트경로
public class CalculatorController {

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
