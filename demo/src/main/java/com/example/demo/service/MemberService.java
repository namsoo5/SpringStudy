package com.example.demo.service;

import com.example.demo.dto.request.InsertMemberRequestDTO;
import com.example.demo.dto.request.UpdateMemberRequestDTO;
import com.example.demo.dto.response.DetailMemberResponseDTO;
import com.example.demo.dto.response.SimpleMemberResponseDTO;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
//    private List<Member> members = new ArrayList<>();
//    private int autoIncrement = 1;

    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public boolean saveMember(InsertMemberRequestDTO member){
//        member.setId(autoIncrement++);
//
//        members.add(member);
//
//        return member;
        return memberMapper.insertMember(member) != 0;
    }

    public List<SimpleMemberResponseDTO> getAllMembers(){
        List dataList = new ArrayList<SimpleMemberResponseDTO>();
        for(Member member : memberMapper.getAllMembers()){
            dataList.add(SimpleMemberResponseDTO.convert(member));
        }
        return dataList;
    }

    public DetailMemberResponseDTO getMemberById(int memberId){
//        for(Member member : members){
//            if(member.getId() == memberId){
//                return member;
//            }
//        }
//        return null;
        Member member = memberMapper.getMemberById(memberId);

        return DetailMemberResponseDTO.convert(member);
    }

    public boolean putMember(int memberId, UpdateMemberRequestDTO updatedMember){
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
