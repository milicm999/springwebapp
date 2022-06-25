package com.maja.springwebapp.repositories;

import com.maja.springwebapp.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
