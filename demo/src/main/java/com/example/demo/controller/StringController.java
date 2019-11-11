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
    public String append(@RequestParam("str1") String s1, @RequestParam("str2") String s2){
        return stringService.append(s1, s2);
    }

    @GetMapping("/contains")
    public boolean contain(@RequestParam("str1") String s1, @RequestParam("str2") String s2){
        return stringService.contain(s1, s2);
    }

    @GetMapping("/len")
    public int len(@RequestParam("str1") String s1){
        return stringService.length(s1);
    }

    @GetMapping("/equals")
    public boolean equal(@RequestParam("str1") String s1, @RequestParam("str2") String s2) {
        return stringService.equal(s1, s2);
    }


}
