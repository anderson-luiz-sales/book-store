package br.com.bookstore.dtos.responses;

import lombok.Data;

import java.io.Serializable;

@Data
public class PublishingCompanyResponseDTO implements Serializable {

    private Integer id;
    private String name;
    private String adress;
}
