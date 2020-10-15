package br.com.bookstore.controllers;

import br.com.bookstore.dtos.requests.AuthorRequestDTO;
import br.com.bookstore.dtos.responses.AuthorResponseDTO;
import br.com.bookstore.facades.AuthorFacade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookstore/v1/authors")
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    private AuthorFacade authorFacade;

    @ApiOperation(value = "Post Author v1")
    @PostMapping
    public ResponseEntity<AuthorResponseDTO> create(@RequestBody AuthorRequestDTO authorRequestDTO) {
        return new ResponseEntity<>(authorFacade.save(authorRequestDTO), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get Author v1")
    @GetMapping
    public ResponseEntity<List<AuthorResponseDTO>> getAuthor() {
        return new ResponseEntity<>(authorFacade.getAuthors(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get By Id Author v1")
    @GetMapping("/{id}")
    public ResponseEntity<AuthorResponseDTO> getById(@PathVariable Integer id) {
        return new ResponseEntity<>(authorFacade.findById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Put Author v1")
    @PutMapping
    public ResponseEntity<AuthorResponseDTO> update(@RequestBody AuthorRequestDTO authorRequestDTO) {
        return new ResponseEntity<>(authorFacade.update(authorRequestDTO), HttpStatus.OK);
    }

    @ApiOperation(value = "Delete Author v1")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        authorFacade.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
