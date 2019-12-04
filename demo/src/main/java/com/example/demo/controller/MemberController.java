package com.example.demo.controller;

import com.example.demo.dto.request.InsertMemberRequestDTO;
import com.example.demo.dto.request.UpdateMemberRequestDTO;
import com.example.demo.dto.response.SimpleMemberResponseDTO;
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
    public boolean saveMember(@RequestBody InsertMemberRequestDTO member){
        return memberService.saveMember(member);
    }

    @GetMapping("")
    public List<SimpleMemberResponseDTO> getAllMembers(){
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public Member getMemberById(@PathVariable int memberId){
        return memberService.getMemberById(memberId);
    }

    @PutMapping("/{memberId}")
    public boolean updateMember(@PathVariable int memberId, @RequestBody UpdateMemberRequestDTO updateMember){
        return memberService.putMember(memberId, updateMember);
    }

    @DeleteMapping("/{memberId}")
    public boolean deleteMember(@PathVariable int memberId){
        return memberService.deleteMember(memberId);
    }
}
