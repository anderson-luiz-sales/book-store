package br.com.bookstore.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tab_book")
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "publishingCompany_id")
    private PublishingCompany publishingCompany;

    @ManyToMany
    @JoinTable(name = "tb_book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
}
