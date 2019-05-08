package com.ragula.springbootsample;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    private static List<Book> books = Arrays.asList(
            new Book(1, "Clean Code", "Programming"),
            new Book(2, "Head First", "Java"),
            new Book(3, "Design Patterns", "Programming")
    );
    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int id) {
        return books.stream().filter( b -> b.getId() == id).findFirst().get();
    }

    public Book createBook(Book book) {
        books.add(book);
        return book;
    }

    public void deleteBook(int id) {
        books.removeIf((b -> b.getId() == id));
    }
}
