package br.com.bookstore.services;

import br.com.bookstore.entities.Author;

import java.util.List;

public interface AuthorService {

    Author save(Author author);
    List<Author> getAuthors();
    Author findById(Integer id);
    void deleteById(Integer id);
}
