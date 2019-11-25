package com.example.demo.service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
//    private List<Member> members = new ArrayList<>();
//    private int autoIncrement = 1;

    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public boolean saveMember(Member member){
//        member.setId(autoIncrement++);
//
//        members.add(member);
//
//        return member;
        return memberMapper.insertMember(member) != 0;
    }

    public List<Member> getAllMembers(){
        return memberMapper.getAllMembers();
    }

    public Member getMemberById(int memberId){
//        for(Member member : members){
//            if(member.getId() == memberId){
//                return member;
//            }
//        }
//        return null;

        return memberMapper.getMemberById(memberId);
    }

    public boolean putMember(int memberId, Member updatedMember){
//
//        for(Member member : members){
//            if(member.getId() == memberId){
//
//                member.setEmail(updatedMember.getEmail());
//                member.setPassword(updatedMember.getPassword());
//                member.setName(updatedMember.getName());
//                member.setPhoneNumber(updatedMember.getPhoneNumber());
//
//                return member;
//            }
//        }
//
//        //put은 없으면 새로 넣어줘야함
//        updatedMember.setId(autoIncrement++);
//        members.add(updatedMember);
//
//        return updatedMember;

        return memberMapper.updateMember(memberId, updatedMember) != 0;
    }

    public boolean deleteMember(int memberId){

//        for(Member member : members){
//            if(member.getId() == memberId){
//               members.remove(member);
//               return member;
//            }
//        }
//
//        return null;

        return memberMapper.deleteMember(memberId) != 0;
    }
}
