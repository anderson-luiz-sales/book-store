package br.com.bookstore.controllers;

import br.com.bookstore.dtos.requests.BookRequestDTO;
import br.com.bookstore.dtos.responses.BookResponseDTO;
import br.com.bookstore.facades.BookFacade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookstore/v1/books")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookFacade bookFacade;

    @ApiOperation(value = "Post Books v1")
    @PostMapping
    public ResponseEntity<BookResponseDTO> create(@RequestBody BookRequestDTO bookRequestDTO) {
        return new ResponseEntity<>(bookFacade.save(bookRequestDTO), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get Books v1")
    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> getBooks() {
        return new ResponseEntity<>(bookFacade.getBooks(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get By Id Book v1")
    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDTO> getById(@PathVariable Integer id) {
        return new ResponseEntity<>(bookFacade.findById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Put Books v1")
    @PutMapping
    public ResponseEntity<BookResponseDTO> update(@RequestBody BookRequestDTO bookRequestDTO) {
        return new ResponseEntity<>(bookFacade.save(bookRequestDTO), HttpStatus.OK);
    }

    @ApiOperation(value = "Delete Book v1")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        bookFacade.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
