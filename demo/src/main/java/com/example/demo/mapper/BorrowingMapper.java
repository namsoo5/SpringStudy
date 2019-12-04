package com.example.demo.mapper;

import com.example.demo.model.Book;
import com.example.demo.model.Borrowing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Mapper
@Component
public interface BorrowingMapper {

    public List<Borrowing> getBorrowListById(@Param("memberId") int memberId, @Param("bookId") int bookId);

    public Borrowing getBorrowListByBorrowId(@Param("borrowId") int borrowId);

    public int borrowBook(@Param("memberId") int memberId, @Param("bookId") int bookId);

    public int lendBook(@Param("bookId")int bookId);

    public int extensionBook(@Param("bookId") int bookId);

    public int deleteBorrowing(@Param("borrowingId") int borrowingId);
}
