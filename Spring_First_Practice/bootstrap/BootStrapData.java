package com.practice.spring.bootstrap;

import com.practice.spring.model.Author;
import com.practice.spring.model.Book;
import com.practice.spring.model.Publisher;
import com.practice.spring.repository.AuthorRepository;
import com.practice.spring.repository.BookRepository;
import com.practice.spring.repository.PublisherRepisotory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepisotory publisherRepisotory;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepisotory publisherRepisotory) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepisotory = publisherRepisotory;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher alinino = new Publisher("Ali Nino", "Ahmad bay Agaoglu str", "Baku", "", "1103");
        publisherRepisotory.save(alinino);

        Author farid = new Author("Farid", "Mammadli");
        Author gabil = new Author("Gabil", "Gurbanov");
        Author mehdi = new Author("Mehdi", "Akbarli");
        authorRepository.saveAll(Arrays.asList(farid, gabil, mehdi));

        Book java = new Book("Cloud Native Java", "552394");
        Book spring = new Book("Spring in Action", "471794");
        Book microservices = new Book("Spring Microservices in Action", "824847");

        java.setPublisher(alinino);
        spring.setPublisher(alinino);
        microservices.setPublisher(alinino);

        java.getAuthors().add(gabil);
        spring.getAuthors().add(mehdi);
        microservices.getAuthors().add(farid);
        bookRepository.saveAll(Arrays.asList(java,spring,microservices));
    }
}
