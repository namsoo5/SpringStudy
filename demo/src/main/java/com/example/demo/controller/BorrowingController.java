package com.example.demo.controller;

import com.example.demo.model.Borrowing;
import com.example.demo.service.BorrowingService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/borrowings")
public class BorrowingController {

    private final BorrowingService borrowingService;

    public BorrowingController(BorrowingService borrowingService) {
        this.borrowingService = borrowingService;
    }

    @GetMapping
    public List<Borrowing> getBorrowListById(@RequestParam(value = "memberId", required = false, defaultValue = "-1") int memberId, @RequestParam(value = "bookId", required = false, defaultValue = "-1") int bookId) {

            return borrowingService.getBorrowListById(memberId, bookId);
    }

    @GetMapping("/{borrowingId}")
    public Borrowing getBorrowListByBorrowId(@PathVariable int borrowingId){
        return borrowingService.getBorrowListByBorrowId(borrowingId);
    }

    @PostMapping("/members/{memberId}/books/{bookId}")
    public boolean borrowBook(@PathVariable int memberId, @PathVariable int bookId) throws ParseException {
        return borrowingService.borrowBook(memberId,bookId);
    }

    @PatchMapping("/return/books/{bookId}")
    public boolean lendBook(@PathVariable int bookId) throws ParseException {
        return borrowingService.lendBook(bookId);
    }

    @PatchMapping("/extension/books/{bookId}")
    public boolean extensionBook(@PathVariable int bookId){
        return borrowingService.extensionBook(bookId);
    }

    @DeleteMapping("/{borrowingId}")
    public boolean deleteBorrowing(@PathVariable int borrowingId){
        return borrowingService.deleteBorrowing(borrowingId);
    }
}
