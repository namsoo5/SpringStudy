package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {

    //get /sum/?num=[]&num2=[]
    @GetMapping("/sum")
    public int Sum(int a, int b){

        return a+b;

    }

    @GetMapping("/multi")
    public int Mutli(int a, int b){

        return a*b;

    }

    @GetMapping("/div")
    public float Div(int a, int b){

        return (float)a/b;

    }

    @GetMapping("/sub")
    public int Sub(int a, int b){

        return a-b;

    }
}
