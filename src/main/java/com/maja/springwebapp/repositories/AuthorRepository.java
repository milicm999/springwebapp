package com.maja.springwebapp.repositories;

import com.maja.springwebapp.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
