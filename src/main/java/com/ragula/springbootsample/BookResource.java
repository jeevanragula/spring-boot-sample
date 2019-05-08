package com.ragula.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/books")
public class BookResource {

    @GetMapping
    public List<Book> getAllBooks() {

        List<Book> books = Arrays.asList(
                new Book(1, "Clean Code", "Programming"),
                new Book(2, "Head First", "Java"),
                new Book(3, "Design Patterns", "Programming")
                );

        return books;
    }

}
