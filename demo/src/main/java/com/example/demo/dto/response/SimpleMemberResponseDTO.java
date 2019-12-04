package com.example.demo.dto.response;

import com.example.demo.model.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class SimpleMemberResponseDTO {
    private int id;
    private String email;
    private String name;
    private String phoneNumber;

    public static SimpleMemberResponseDTO convert(Member member){
        return SimpleMemberResponseDTO.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .phoneNumber(member.getPhoneNumber())
                .build();
    }
}
