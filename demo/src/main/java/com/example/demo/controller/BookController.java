package com.example.demo.controller;

import com.example.demo.dto.request.InsertBookRequestDTO;
import com.example.demo.dto.request.UpdateBookRequestDTO;
import com.example.demo.dto.response.DetailBookResponseDTO;
import com.example.demo.dto.response.SimpleBookResponseDTO;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //추가
    @PostMapping("")
    public boolean saveBook(@RequestBody InsertBookRequestDTO book){
        return bookService.saveBook(book) != 0;
    }

    //전체검색
    @GetMapping("")
    public List<SimpleBookResponseDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    //아이디검색
    @GetMapping("/{bookId}")
    public DetailBookResponseDTO getBooksById(@PathVariable int bookId){
        return bookService.getBooksById(bookId);
    }

    //수정
    @PutMapping("/{bookId}")
    public boolean putBook(@RequestBody UpdateBookRequestDTO book, @PathVariable int bookId){
        return bookService.putBook(bookId, book);
    }

    @DeleteMapping("/{bookId}")
    public boolean deleteBook(@PathVariable int bookId){
        return bookService.deleteBook(bookId);
    }
}
