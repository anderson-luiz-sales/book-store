package br.com.bookstore.dtos.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookRequestDTO implements Serializable {

    private Integer id;
    private String title;
    private Double price;
}
