package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean out;
}
