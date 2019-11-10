package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String Append(String s1, String s2){
        return s1+s2;
    }

    public boolean Contain(String s1, String s2){

        if(s1.indexOf(s2) == -1){
            return false;
        }

        return true;
    }

    public int Length(String s1){
        return s1.length();
    }

    public boolean Equal(String s1, String s2){
        return s1.equals(s2);
    }



}
