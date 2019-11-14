package com.example.demo.service;

import com.example.demo.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private List<Member> members = new ArrayList<>();
    private int autoIncrement = 1;

    public Member saveMember(Member member){
        member.setId(autoIncrement++);
        return member;
    }

}
