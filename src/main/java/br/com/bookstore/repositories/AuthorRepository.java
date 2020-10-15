package br.com.bookstore.repositories;

import br.com.bookstore.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findByid(Integer id);
}
