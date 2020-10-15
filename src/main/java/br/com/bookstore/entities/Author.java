package br.com.bookstore.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_author")
@Data
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "Age")
    private Integer age;



}
