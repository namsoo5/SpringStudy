package com.example.demo.controller;

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
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    //전체검색
    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    //아이디검색
    @GetMapping("/{bookId}")
    public Book getBooksById(@PathVariable int bookId){
        return bookService.getBooksById(bookId);
    }

    //수정
    @PutMapping("/{bookId}")
    public Book putBook(@RequestBody Book book, @PathVariable int bookId){
        return bookService.putBook(bookId, book);
    }

    @DeleteMapping("/{bookId}")
    public Book deleteBook(@PathVariable int bookid){
        return bookService.deleteBook(bookid);
    }
}
