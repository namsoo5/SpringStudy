package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Borrowing {
    private int id;
    private Member member;
    private Book book;
    private Date startTime;
    private Date expiryTime;
    private Date returnTime;

}
