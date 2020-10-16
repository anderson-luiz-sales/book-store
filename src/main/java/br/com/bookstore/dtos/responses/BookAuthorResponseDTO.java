package br.com.bookstore.dtos.responses;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookAuthorResponseDTO implements Serializable {

    private Integer bookId;
    private Integer authorId;
}
