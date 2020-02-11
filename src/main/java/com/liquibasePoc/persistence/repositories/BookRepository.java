package com.liquibasePoc.persistence.repositories;

import com.liquibasePoc.persistence.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
