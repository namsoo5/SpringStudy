package com.example.demo.controller;

import com.example.demo.model.Borrowing;
import com.example.demo.service.BorrowingService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/borrowings")
public class BorrowingController {

    private final BorrowingService borrowingService;

    public BorrowingController(BorrowingService borrowingService) {
        this.borrowingService = borrowingService;
    }
    @GetMapping
    public List<Borrowing> getAllBorrowList() {
        return borrowingService.getAllBorrowList();
    }

    @GetMapping
    public Borrowing getBorrowListByMemberId(@RequestParam("memberId") int memberId) {
        return borrowingService.getBorrowListByMemberId(memberId);
    }

    @GetMapping
    public Borrowing getBorrowListByBookId(@RequestParam("bookId") int bookId) {
        return borrowingService.getBorrowListByBookId(bookId);
    }

    @GetMapping
    public Borrowing getBorrowListById(@RequestParam("memberId") int memberId, @RequestParam("bookId") int bookId) {
        return borrowingService.getBorrowListById(memberId, bookId);
    }

    @GetMapping("/{borrowingId}")
    public Borrowing getBorrowListByBorrowId(@PathVariable int borrowingId){
        return borrowingService.getBorrowListByBorrowId(borrowingId);
    }

    @PostMapping("/members/{memberId}/books/{bookId}")
    public Borrowing borrowBook(@PathVariable int memberId, @PathVariable int bookId) throws ParseException {
        return borrowingService.borrowBook(memberId,bookId);
    }

    @PatchMapping("/return/books/{bookId}")
    public Borrowing lendBook(@PathVariable int bookId) throws ParseException {
        return borrowingService.lendBook(bookId);
    }

    @PatchMapping("/extension/books/{bookId}")
    public Borrowing extensionBook(@PathVariable int bookId){
        return borrowingService.extensionBook(bookId);
    }

    @DeleteMapping("/{borrowingId}")
    public Borrowing deleteBorrowing(@PathVariable int borrowingId){
        return borrowingService.deleteBorrowing(borrowingId);
    }
}
