package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private int autoIncrement = 1;

    //추가
    public Book saveBook(Book book){
        book.setId(autoIncrement++);
        books.add(book);

        return book;
    }

    //전체조회
    public List<Book> getAllBooks(){
        return books;
    }

    //아이디조회
    public Book getBooksById(int bookId){

        for(Book book : books){
            if(book.getId() == bookId){
                return book;
            }
        }

        return null;
    }

    //정보수정
    public Book putBook(int bookId, Book updateBook){
        for(Book book : books){
            if(book.getId() == bookId){
                book.setAuthor(updateBook.getAuthor());
                book.setOut(updateBook.isOut());
                book.setTitle(updateBook.getTitle());

                return book;
            }
        }

        updateBook.setId(autoIncrement++);
        books.add(updateBook);

        return updateBook;
    }

    //삭제
    public Book deleteBook(int bookId){
        for(Book book : books){
            if(book.getId() == bookId){
                books.remove(book);
                return book;
            }
        }
        return null;
    }


}
