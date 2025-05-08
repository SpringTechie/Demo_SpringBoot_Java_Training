package com.java.training.controller;

import com.java.training.entity.Book;
import com.java.training.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping("/save")
    public String saveBook(@RequestBody Book book) {
       return bookService.saveBook(book);
    }

    @GetMapping("/get/{id}")
    public Book getBook(@PathVariable int id) {
      return bookService.getBook(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
       return bookService.deleteBook(id);
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody Book book) {
      return  bookService.updateBook(book);
    }
}
