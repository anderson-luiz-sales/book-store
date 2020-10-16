package br.com.bookstore.services.impl;

import br.com.bookstore.entities.BookAuthor;
import br.com.bookstore.repositories.BookAuthorRepository;
import br.com.bookstore.services.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorServiceImpl implements BookAuthorService {

    @Autowired
    private BookAuthorRepository bookAuthorRepository;

    @Override
    public BookAuthor save(BookAuthor bookAuthor) {
        return bookAuthorRepository.save(bookAuthor);
    }
}
