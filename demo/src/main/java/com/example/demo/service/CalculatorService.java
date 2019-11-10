package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {

    //get /sum/?num=[]&num2=[]
//    @GetMapping("/sum")
    public int Sum(int a, int b){

        return a+b;
    }

//    @GetMapping("/multi")
    public int Mutli(int a, int b){

        return a*b;
    }

//    @GetMapping("/div")
    public float Div(int a, int b){

        return (float)a/b;
    }

//    @GetMapping("/sub")
    public int Sub(int a, int b){

        return a-b;
    }

//    @GetMapping("/mod")
    public float Mod(int a, int b){

        return a%b;
    }

//    @GetMapping("/min")
    public int Min(int a, int b){

        return Math.min(a,b);
    }

//    @GetMapping("/max")
    public int Max(int a, int b){

        return Math.max(a,b);
    }

//    @GetMapping("/pow")
    public double Pow(int a, int b){

        return Math.pow(a,b);
    }
}
