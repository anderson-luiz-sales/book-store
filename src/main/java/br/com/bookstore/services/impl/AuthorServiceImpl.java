package br.com.bookstore.services.impl;

import br.com.bookstore.entities.Author;
import br.com.bookstore.exceptions.NotFoundException;
import br.com.bookstore.repositories.AuthorRepository;
import br.com.bookstore.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(Integer id) {
        if(authorRepository.findByid(id) == null) {
            throw new NotFoundException("");
        }
        return authorRepository.findByid(id);
    }

    @Override
    public Author findByName(String name) {
        if(authorRepository.findByName(name) == null) {
            throw new NotFoundException("");
        }
        return authorRepository.findByName(name);
    }

    @Override
    public void deleteById(Integer id) {
        authorRepository.deleteById(id);
    }
}
