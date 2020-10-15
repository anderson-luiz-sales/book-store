package br.com.bookstore.controllers;

import br.com.bookstore.dtos.requests.PublishingCompanyRequestDTO;
import br.com.bookstore.dtos.responses.PublishingCompanyResponseDTO;
import br.com.bookstore.facades.PublishingCompanyFacade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookstore/v1/publishers")
@CrossOrigin(origins = "*")
public class PublishingCompanyController {

    @Autowired
    private PublishingCompanyFacade companyFacade;

    @ApiOperation(value = "Post Publishers v1")
    @PostMapping
    public ResponseEntity<PublishingCompanyResponseDTO> create(@RequestBody PublishingCompanyRequestDTO publishingCompanyRequestDTO) {
        return new ResponseEntity<>(companyFacade.save(publishingCompanyRequestDTO), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get Publishers v1")
    @GetMapping
    public ResponseEntity<List<PublishingCompanyResponseDTO>> getPublishers() {
        return new ResponseEntity<>(companyFacade.getPublishers(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get By Id Publishers v1")
    @GetMapping("/{id}")
    public ResponseEntity<PublishingCompanyResponseDTO> getById(@PathVariable Integer id) {
        return new ResponseEntity<>(companyFacade.findById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Put Publishers v1")
    @PutMapping
    public ResponseEntity<PublishingCompanyResponseDTO> update(@RequestBody PublishingCompanyRequestDTO publishingCompanyRequestDTO) {
        return new ResponseEntity<>(companyFacade.save(publishingCompanyRequestDTO), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Delete Publishers v1")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
         companyFacade.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
