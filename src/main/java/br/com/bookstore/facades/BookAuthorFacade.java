package br.com.bookstore.facades;

import br.com.bookstore.dtos.requests.BookAuthorRequestDTO;
import br.com.bookstore.dtos.responses.BookAuthorResponseDTO;

public interface BookAuthorFacade {

    BookAuthorResponseDTO save(BookAuthorRequestDTO bookAuthorRequestDTO);
}
