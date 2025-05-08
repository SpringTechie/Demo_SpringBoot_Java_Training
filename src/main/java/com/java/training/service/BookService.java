package com.java.training.service;

import com.java.training.entity.Book;
import com.java.training.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    // pure Business logic.

    @Autowired
    private BookRepository bookRepository;

    // Creating:
    public String saveBook(Book book) {
        bookRepository.save(book); // save Book object in DB.
        return "Book Saved Successfully";
    }

    // Reading
    public Book getBook(int id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            return book.get();
        }
        return null;

    }

    // Deleting
    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "Deleted Successfully";
    }


    public String updateBook(Book book) {
        bookRepository.save(book);
        return "Updated Successfully";
    }
}
