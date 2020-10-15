package br.com.bookstore.facades;

import br.com.bookstore.dtos.requests.BookRequestDTO;
import br.com.bookstore.dtos.responses.BookResponseDTO;

import java.util.List;

public interface BookFacade {

    BookResponseDTO save(BookRequestDTO bookRequestDTO);
    List<BookResponseDTO> getBooks();
    BookResponseDTO findById(Integer id);
    void deleteById(Integer id);
}
