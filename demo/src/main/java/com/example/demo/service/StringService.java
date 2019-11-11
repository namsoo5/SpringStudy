package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String append(String s1, String s2){
        return s1+s2;
    }

    public boolean contain(String s1, String s2){

        if(s1.indexOf(s2) == -1){
            return false;
        }

        return true;
    }

    public int length(String s1){
        return s1.length();
    }

    public boolean equal(String s1, String s2){
        return s1.equals(s2);
    }



}
