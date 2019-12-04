package com.example.demo.dto.response;

import com.example.demo.model.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class DetailMemberResponseDTO {
    private int id;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;

    public static DetailMemberResponseDTO convert(Member member){
        return DetailMemberResponseDTO.builder()
                .id(member.getId())
                .email(member.getEmail())
                .password(member.getPassword())
                .name(member.getName())
                .phoneNumber(member.getPhoneNumber())
                .build();
    }
}
