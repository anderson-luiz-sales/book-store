package br.com.bookstore.facades.impl;

import br.com.bookstore.dtos.requests.BookAuthorRequestDTO;
import br.com.bookstore.dtos.responses.BookAuthorResponseDTO;
import br.com.bookstore.entities.BookAuthor;
import br.com.bookstore.facades.BookAuthorFacade;
import br.com.bookstore.services.BookAuthorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookAuhtorFacadeImpl implements BookAuthorFacade {

    @Autowired
    private BookAuthorService bookAuthorService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BookAuthorResponseDTO save(BookAuthorRequestDTO bookAuthorRequestDTO) {
        return convertToDTO(bookAuthorService.save(convertToEntity(bookAuthorRequestDTO)));
    }

    private BookAuthor convertToEntity(BookAuthorRequestDTO bookAuthorRequestDTO) {
        return modelMapper.map(bookAuthorRequestDTO, BookAuthor.class);
    }

    private BookAuthorResponseDTO convertToDTO(BookAuthor bookAuthor) {
        return modelMapper.map(bookAuthor, BookAuthorResponseDTO.class);
    }
}
