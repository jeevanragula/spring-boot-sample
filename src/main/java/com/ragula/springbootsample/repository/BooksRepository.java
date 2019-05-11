package com.ragula.springbootsample.repository;

import com.ragula.springbootsample.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<Book, Integer> {
}
