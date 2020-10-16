package br.com.bookstore.facades;

import br.com.bookstore.dtos.requests.AuthorRequestDTO;
import br.com.bookstore.dtos.responses.AuthorResponseDTO;

import java.util.List;

public interface AuthorFacade {

    AuthorResponseDTO save(AuthorRequestDTO authorRequestDTO);
    List<AuthorResponseDTO> getAuthors();
    AuthorResponseDTO findById(Integer id);
    AuthorResponseDTO findByName(String name);
    AuthorResponseDTO update(AuthorRequestDTO authorRequestDTO);
    void deleteById(Integer id);
}
