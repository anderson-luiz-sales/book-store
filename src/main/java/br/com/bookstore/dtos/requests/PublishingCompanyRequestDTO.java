package br.com.bookstore.dtos.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class PublishingCompanyRequestDTO implements Serializable {

    private Integer id;
    private String name;
    private String adress;
}
