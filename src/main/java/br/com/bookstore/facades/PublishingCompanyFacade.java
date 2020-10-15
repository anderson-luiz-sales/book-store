package br.com.bookstore.facades;

import br.com.bookstore.dtos.requests.PublishingCompanyRequestDTO;
import br.com.bookstore.dtos.responses.PublishingCompanyResponseDTO;

import java.util.List;

public interface PublishingCompanyFacade {

    PublishingCompanyResponseDTO save(PublishingCompanyRequestDTO publishingCompanyRequestDTO);
    List<PublishingCompanyResponseDTO> getPublishers();
    PublishingCompanyResponseDTO findById(Integer id);
    void deleteById(Integer id);
}
