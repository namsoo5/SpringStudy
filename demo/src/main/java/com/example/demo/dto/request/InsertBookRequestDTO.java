package com.example.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class InsertBookRequestDTO {
    private String title;
    private String author;
    private boolean out;
}
