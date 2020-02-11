package com.liquibasePoc.persistence.repositories;

import com.liquibasePoc.persistence.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
