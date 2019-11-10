package com.example.demo.controller;

import com.example.demo.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")  //상위루트경로
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/sum")
    public int Sum(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Sum(a,b);
    }

    @GetMapping("/sub")
    public int Sub(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Sub(a,b);
    }

    @GetMapping("/div")
    public float Div(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Div(a,b);
    }

    @GetMapping("/multi")
    public int Multi(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Mutli(a,b);
    }

    @GetMapping("/mod")
    public float Mod(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Mod(a,b);
    }

    @GetMapping("/min")
    public int Min(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Min(a,b);
    }

    @GetMapping("/max")
    public int Max(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Max(a,b);
    }

    @GetMapping("/pow")
    public double Pow(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.Pow(a,b);
    }


}
