package com.example.demo.service;

import com.example.demo.dto.request.InsertBookRequestDTO;
import com.example.demo.dto.request.UpdateBookRequestDTO;
import com.example.demo.dto.response.DetailBookResponseDTO;
import com.example.demo.dto.response.SimpleBookResponseDTO;
import com.example.demo.mapper.BookMapper;
import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
//    private List<Book> books = new ArrayList<>();
//    private int autoIncrement = 1;
    private final BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    //추가
    public int saveBook(InsertBookRequestDTO book){
//        book.setId(autoIncrement++);
//        books.add(book);
//
//        return book;
        return bookMapper.insertBook(book);
    }

    //전체조회
    public List<SimpleBookResponseDTO> getAllBooks(){
//        return books;
//        return bookMapper.getAllBooks();

        List books = new ArrayList<SimpleBookResponseDTO>();
        for(Book book : bookMapper.getAllBooks()){
            books.add(SimpleBookResponseDTO.convert(book));
        }

        return books;
    }

    //아이디조회
    public DetailBookResponseDTO getBooksById(int bookId){

//        for(Book book : books){
//            if(book.getId() == bookId){
//                return book;
//            }
//        }
//
//        return null;
//        return bookMapper.getBookById(bookId);

        return DetailBookResponseDTO.convert(bookMapper.getBookById(bookId));
    }

    //정보수정
    public boolean putBook(int bookId, UpdateBookRequestDTO updateBook){
//        for(Book book : books){
//            if(book.getId() == bookId){
//                book.setAuthor(updateBook.getAuthor());
//                book.setOut(updateBook.isOut());
//                book.setTitle(updateBook.getTitle());
//
//                return book;
//            }
//        }
//
//        updateBook.setId(autoIncrement++);
//        books.add(updateBook);
//
//        return updateBook;

        System.out.println(updateBook.isOut());
        return bookMapper.updateBook(bookId, updateBook) != 0;
    }

    //삭제
    public boolean deleteBook(int bookId){
//        for(Book book : books){
//            if(book.getId() == bookId){
//                books.remove(book);
//                return book;
//            }
//        }
//        return null;
        return bookMapper.deleteBook(bookId) != 0;
    }


}
