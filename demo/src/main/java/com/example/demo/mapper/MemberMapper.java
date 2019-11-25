package com.example.demo.mapper;

import com.example.demo.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {

    public List<Member> getAllMembers();

    public Member getMemberById(@Param("id") int id);

    public int insertMember(@Param("member") Member member);

    public int updateMember(@Param("id") int id, @Param("member") Member member);

    public int deleteMember(@Param("id") int id);
}