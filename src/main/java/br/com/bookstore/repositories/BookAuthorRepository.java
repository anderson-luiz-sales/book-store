package br.com.bookstore.repositories;

import br.com.bookstore.entities.BookAuthor;
import br.com.bookstore.entities.keys.BookAuthorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, BookAuthorId> {
}
