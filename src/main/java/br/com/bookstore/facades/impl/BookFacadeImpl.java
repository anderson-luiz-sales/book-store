package br.com.bookstore.facades.impl;

import br.com.bookstore.dtos.requests.BookRequestDTO;
import br.com.bookstore.dtos.responses.BookResponseDTO;
import br.com.bookstore.entities.Book;
import br.com.bookstore.facades.BookFacade;
import br.com.bookstore.services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookFacadeImpl implements BookFacade {

    @Autowired
    private BookService bookService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BookResponseDTO save(BookRequestDTO bookRequestDTO) {
        return convertToDTO(bookService.save(convertToEntity(bookRequestDTO)));
    }

    @Override
    public List<BookResponseDTO> getBooks() {
        List<BookResponseDTO> bookList = new ArrayList<>();

        for (Book book : bookService.getBooks()) {
            bookList.add(convertToDTO(book));
        }

        return bookList;
    }

    @Override
    public BookResponseDTO findById(Integer id) {
        return convertToDTO(bookService.findById(id));
    }

    @Override
    public void deleteById(Integer id) {
        bookService.deleteById(id);
    }

    private Book convertToEntity(BookRequestDTO bookRequestDTO) {
        return modelMapper.map(bookRequestDTO, Book.class);
    }

    private BookResponseDTO convertToDTO(Book book) {
        return modelMapper.map(book, BookResponseDTO.class);
    }
}
