package com.example.demo.dto.response;


import com.example.demo.model.Book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class SimpleBookResponseDTO {
    private String title;
    private String author;
    private boolean out;

    public static SimpleBookResponseDTO convert(Book book){
        return SimpleBookResponseDTO.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .out(book.isOut())
                .build();
    }
}
