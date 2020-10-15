package br.com.bookstore.services;

import br.com.bookstore.entities.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);
    List<Book> getBooks();
    Book findById(Integer id);
    void deleteById(Integer id);
}
