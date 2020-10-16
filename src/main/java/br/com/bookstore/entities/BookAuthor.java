package br.com.bookstore.entities;

import br.com.bookstore.entities.keys.BookAuthorId;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_book_author")
@Data
public class BookAuthor implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private BookAuthorId id;
}
