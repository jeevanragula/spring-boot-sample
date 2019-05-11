package com.ragula.springbootsample;

import com.ragula.springbootsample.model.Book;
import com.ragula.springbootsample.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSampleApplication implements CommandLineRunner {

    @Autowired
    private BooksRepository booksRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        //booksRepository.save(new Book(1,"Head First", "Java"));
        //booksRepository.save(new Book(2,"Clean Code", "Java"));

    }
}
