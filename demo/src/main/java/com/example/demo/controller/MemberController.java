package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("")
    public Member saveMember(@RequestBody Member member){
        return memberService.saveMember(member);
    }

    @GetMapping("")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public Member getMemberById(@PathVariable int memberId){
        return memberService.getMemberById(memberId);
    }

    @PutMapping("/{memberId}")
    public Member updateMember(@PathVariable int memberId, @RequestBody Member updateMember){
        return memberService.putMember(memberId, updateMember);
    }

    @DeleteMapping("/{memberId}")
    public Member deleteMember(@PathVariable int memberId){
        return memberService.deleteMember(memberId);
    }
}
