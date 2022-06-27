package com.maja.springwebapp.bootstrap;

import com.maja.springwebapp.entities.Author;
import com.maja.springwebapp.entities.Book;
import com.maja.springwebapp.entities.Publisher;
import com.maja.springwebapp.repositories.AuthorRepository;
import com.maja.springwebapp.repositories.BookRepository;
import com.maja.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String[] args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Publisher delfi=new Publisher("Delfi");
        Book book1 = new Book("Domain Driven Design", "123456");
        eric.getBooks().add(book1);

        authorRepository.save(eric);
        bookRepository.save(book1);

        book1.getAuthors().add(eric);
        delfi.getBooks().add(book1);
        book1.getPublishers().add(delfi);
        publisherRepository.save(delfi);


        Author rod=new Author("Rod","Johnson");
        Publisher p= new Publisher("Laguna");
        Book noEJB= new Book("J2EE Development without EJB", "123425");
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        noEJB.getAuthors().add(rod);
        p.getBooks().add(noEJB);
        noEJB.getPublishers().add(p);
        publisherRepository.save(p);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of publishers: "+publisherRepository.count());
        System.out.println("Number of books: "+ bookRepository.count());
        System.out.println("Number of authors: "+authorRepository.count());





    }
}
