package br.com.bookstore.dtos.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookAuthorRequestDTO implements Serializable {

    private Integer bookId;
    private Integer authorId;
}
