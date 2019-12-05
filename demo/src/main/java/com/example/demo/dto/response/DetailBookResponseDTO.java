package com.example.demo.dto.response;

import com.example.demo.model.Book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class DetailBookResponseDTO {
    private int id;
    private String title;
    private String author;
    private boolean out;

    public static DetailBookResponseDTO convert(Book book){
        return DetailBookResponseDTO.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .out(book.isOut())
                .build();
    }
}
