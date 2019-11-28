package com.example.demo.service;

import com.example.demo.mapper.BorrowingMapper;
import com.example.demo.model.Book;
import com.example.demo.model.Borrowing;
import com.example.demo.model.Member;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BorrowingService {
//    private List<Borrowing> borrowings = new ArrayList<>();
//    private int autoIncrement = 1;
    private final MemberService memberService;
    private final BookService bookService;
    private final BorrowingMapper borrowingMapper;

    public BorrowingService(MemberService memberService, BookService bookService, BorrowingMapper borrowingMapper) {
        this.memberService = memberService;
        this.bookService = bookService;
        this.borrowingMapper = borrowingMapper;
    }


    public List<Borrowing> getBorrowListById(int memberId, int bookId) {
//        List<Borrowing> list = new ArrayList<>();
//
//        for (Borrowing borrow : borrowings) {
//            if ((memberId == -1 || borrow.getMember().getId() == memberId)
//                    && (bookId == -1 || borrow.getBook().getId() == bookId)) {
//                list.add(borrow);
//            }
//        }
//
//        return list;

        return borrowingMapper.getBorrowListById(memberId, bookId);
    }

    public Borrowing getBorrowListByBorrowId(int borrowId) {
//        for (Borrowing borrow : borrowings) {
//            if (borrow.getId() == borrowId) {
//                return borrow;
//            }
//        }
//
//        return null;
        return borrowingMapper.getBorrowListByBorrowId(borrowId);

    }

    public boolean borrowBook(int memberId, int bookId) throws ParseException {
//        Member member = memberService.getMemberById(memberId);
//        Book book = bookService.getBooksById(bookId);
//
//        if(book.isOut()){
//            return null;
//        }
//
//        book.setOut(true);
//
//        Borrowing borrow = new Borrowing();
//        borrow.setId(autoIncrement++);
//        borrow.setMember(member);
//        borrow.setBook(book);
//        Calendar today = Calendar.getInstance();
//        today.setTime(new Date());
//        borrow.setStartTime(changeFormat(today));
//        borrow.setExpiryTime(afterWeek(today));
//
//        borrowings.add(borrow);
//        return borrow;
        return borrowingMapper.borrowBook(memberId, bookId) != 0;
    }

    public Date afterWeek(Calendar cal) {

        cal.add(Calendar.DATE, 7);
        Date after = cal.getTime();
        return after;
    }

    public Date changeFormat(Calendar cal) throws ParseException {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date day = cal.getTime();
        return day;
    }

    public boolean lendBook(int bookId) throws ParseException {
//        bookService.getBooksById(bookId).setOut(false);
//        for (Borrowing borrow : borrowings) {
//            if (borrow.getBook().getId() == bookId) {
//                borrow.setReturnTime(changeFormat(Calendar.getInstance()));
//                return borrow;
//            }
//        }
//        return null;
        return borrowingMapper.lendBook(bookId) != 0;
    }

    public boolean extensionBook(int bookId) {
//        for (Borrowing borrow : borrowings) {
//            if (borrow.getBook().getId() == bookId) {
//                Date expiry = borrow.getExpiryTime();
//                Calendar cal = Calendar.getInstance();
//                cal.setTime(expiry);
//                borrow.setExpiryTime(afterWeek(cal));
//                return borrow;
//            }
//        }
//        return null;
        return borrowingMapper.extensionBook(bookId) != 0;
    }

    public boolean deleteBorrowing(int borrowingId) {
//        for (Borrowing borrow : borrowings) {
//            if (borrow.getId() == borrowingId) {
//                borrowings.remove(borrow);
//                return borrow;
//            }
//        }
//        return null;
        return borrowingMapper.deleteBorrowing(borrowingId) != 0;
    }
}

