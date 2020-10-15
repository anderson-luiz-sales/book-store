package br.com.bookstore.dtos.responses;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BookResponseDTO implements Serializable {

    private Integer id;
    private String title;
    private Double price;
    private List<AuthorResponseDTO> authors;
}
