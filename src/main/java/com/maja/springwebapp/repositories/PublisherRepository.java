package com.maja.springwebapp.repositories;

import com.maja.springwebapp.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
