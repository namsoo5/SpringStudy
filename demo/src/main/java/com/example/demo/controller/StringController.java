package com.example.demo.controller;

import com.example.demo.service.StringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class StringController {

    private final StringService stringService;

    public StringController(StringService stringService){
        this.stringService = stringService;
    }

    @GetMapping("/append")
    public String Append(@RequestParam("str1") String s1, @RequestParam("str2") String s2){
        return stringService.Append(s1, s2);
    }

    @GetMapping("/contains")
    public boolean Contain(@RequestParam("str1") String s1, @RequestParam("str2") String s2){
        return stringService.Contain(s1, s2);
    }

    @GetMapping("/len")
    public int Append(@RequestParam("str1") String s1){
        return stringService.Length(s1);
    }

    @GetMapping("/equals")
    public boolean Equal(@RequestParam("str1") String s1, @RequestParam("str2") String s2) {
        return stringService.Equal(s1, s2);
    }


}
