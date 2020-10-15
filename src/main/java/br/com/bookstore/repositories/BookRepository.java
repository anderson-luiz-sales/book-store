package br.com.bookstore.repositories;

import br.com.bookstore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByid(Integer id);
}
