package br.com.bookstore.dtos.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthorRequestDTO implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
}
