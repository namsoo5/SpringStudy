package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.Borrowing;
import com.example.demo.model.Member;
import org.springframework.stereotype.Service;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BorrowingService {
    private List<Borrowing> borrowings = new ArrayList<>();
    private int autoIncrement = 1;
    private final MemberService memberService;
    private final BookService bookService;

    public BorrowingService(MemberService memberService, BookService bookService) {
        this.memberService = memberService;
        this.bookService = bookService;
    }


    public List<Borrowing> getBorrowListById(int memberId, int bookId) {
        List<Borrowing> list = new ArrayList<>();

        for (Borrowing borrow : borrowings) {
            if ((memberId == -1 || borrow.getMember().getId() == memberId)
                    && (bookId == -1 || borrow.getBook().getId() == bookId)) {
                list.add(borrow);
            }
        }

        return list;
    }

    public Borrowing getBorrowListByBorrowId(int borrowId) {
        for (Borrowing borrow : borrowings) {
            if (borrow.getId() == borrowId) {
                return borrow;
            }
        }

        return null;
    }

    public Borrowing borrowBook(int memberId, int bookId) throws ParseException {
        Member member = memberService.getMemberById(memberId);
        Book book = bookService.getBooksById(bookId);

        if(book.isOut()){
            return null;
        }

        book.setOut(true);

        Borrowing borrow = new Borrowing();
        borrow.setId(autoIncrement++);
        borrow.setMember(member);
        borrow.setBook(book);
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());
        borrow.setStartTime(changeFormat(today));
        borrow.setExpiryTime(afterWeek(today));

        borrowings.add(borrow);
        return borrow;
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

    public Borrowing lendBook(int bookId) throws ParseException {
        bookService.getBooksById(bookId).setOut(false);
        for (Borrowing borrow : borrowings) {
            if (borrow.getBook().getId() == bookId) {
                borrow.setReturnTime(changeFormat(Calendar.getInstance()));
                return borrow;
            }
        }
        return null;
    }

    public Borrowing extensionBook(int bookId) {
        for (Borrowing borrow : borrowings) {
            if (borrow.getBook().getId() == bookId) {
                Date expiry = borrow.getExpiryTime();
                Calendar cal = Calendar.getInstance();
                cal.setTime(expiry);
                borrow.setExpiryTime(afterWeek(cal));
                return borrow;
            }
        }
        return null;
    }

    public Borrowing deleteBorrowing(int borrowingId) {
        for (Borrowing borrow : borrowings) {
            if (borrow.getId() == borrowingId) {
                borrowings.remove(borrow);
                return borrow;
            }
        }
        return null;
    }
}

