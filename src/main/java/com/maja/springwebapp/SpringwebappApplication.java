package com.maja.springwebapp;

import com.maja.springwebapp.bootstrap.BootstrapData;
import com.maja.springwebapp.controllers.BookController;
import com.maja.springwebapp.entities.Author;
import com.maja.springwebapp.entities.Book;
import com.maja.springwebapp.entities.Publisher;
import com.maja.springwebapp.repositories.AuthorRepository;
import com.maja.springwebapp.repositories.BookRepository;
import com.maja.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;

@SpringBootApplication
@ComponentScan
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);


	}

}
