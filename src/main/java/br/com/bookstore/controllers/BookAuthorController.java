package br.com.bookstore.controllers;


import br.com.bookstore.dtos.requests.BookAuthorRequestDTO;
import br.com.bookstore.dtos.responses.BookAuthorResponseDTO;
import br.com.bookstore.facades.BookAuthorFacade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookstore/v1/booksauthors")
@CrossOrigin(origins = "*")
public class BookAuthorController {

    @Autowired
    private BookAuthorFacade bookAuthorFacade;

    @ApiOperation(value = "Post BookAuthor v1")
    @PostMapping
    public ResponseEntity<BookAuthorResponseDTO> create(@RequestBody BookAuthorRequestDTO bookAuthorRequestDTO) {
        return new ResponseEntity<>(bookAuthorFacade.save(bookAuthorRequestDTO), HttpStatus.CREATED);
    }
}
