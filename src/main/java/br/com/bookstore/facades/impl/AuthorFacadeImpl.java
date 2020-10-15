package br.com.bookstore.facades.impl;

import br.com.bookstore.dtos.requests.AuthorRequestDTO;
import br.com.bookstore.dtos.responses.AuthorResponseDTO;
import br.com.bookstore.entities.Author;
import br.com.bookstore.facades.AuthorFacade;
import br.com.bookstore.services.AuthorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorFacadeImpl implements AuthorFacade {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AuthorResponseDTO save(AuthorRequestDTO authorRequestDTO) {
        return convertToDTO(authorService.save(convertToEntity(authorRequestDTO)));
    }

    @Override
    public List<AuthorResponseDTO> getAuthors() {
        List<AuthorResponseDTO> authorList = new ArrayList<>();

        for (Author author : authorService.getAuthors()) {
            authorList.add(convertToDTO(author));
        }

        return authorList;
    }

    @Override
    public AuthorResponseDTO findById(Integer id) {
        return convertToDTO(authorService.findById(id));
    }

    @Override
    public AuthorResponseDTO update(AuthorRequestDTO authorRequestDTO) {
        return convertToDTO(authorService.save(convertToEntity(authorRequestDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        authorService.deleteById(id);
    }

    private Author convertToEntity(AuthorRequestDTO authorRequestDTO) {
        return modelMapper.map(authorRequestDTO, Author.class);
    }

    private AuthorResponseDTO convertToDTO(Author author) {
        return modelMapper.map(author, AuthorResponseDTO.class);
    }
}
