package com.ragula.springbootsample.config;

import com.ragula.springbootsample.repository.BooksRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = BooksRepository.class)
public class MongoDBConfig {

}
