package br.com.bookstore.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_publishing_company")
@Data
public class PublishingCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "Adress")
    private String adress;

    @JsonIgnore
    @OneToMany(mappedBy = "publishingCompany")
    private List<Book> books;
}
