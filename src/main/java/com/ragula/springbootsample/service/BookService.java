package com.ragula.springbootsample.service;

import com.ragula.springbootsample.model.Book;
import com.ragula.springbootsample.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book getBookById(int id) {
        return booksRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));
    }

    public Book createBook(Book book) {
        booksRepository.save(book);
        return booksRepository.findById(book.getId()).get();
    }

    public void deleteBook(int id) {
        booksRepository.deleteById(id);
    }
}
