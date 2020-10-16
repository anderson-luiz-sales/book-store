package br.com.bookstore.repositories;

import br.com.bookstore.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findByid(Integer id);

    @Query("select au from Author au where au.name = :name")
    Author findByName(@Param("name") String name);
}
