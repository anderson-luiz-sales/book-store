package br.com.bookstore.facades.impl;

import br.com.bookstore.dtos.requests.AuthorRequestDTO;
import br.com.bookstore.dtos.requests.PublishingCompanyRequestDTO;
import br.com.bookstore.dtos.responses.AuthorResponseDTO;
import br.com.bookstore.dtos.responses.PublishingCompanyResponseDTO;
import br.com.bookstore.entities.Author;
import br.com.bookstore.entities.PublishingCompany;
import br.com.bookstore.facades.PublishingCompanyFacade;
import br.com.bookstore.services.PublishingCompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PublishingCompanyFacadeImpl implements PublishingCompanyFacade {

    @Autowired
    private PublishingCompanyService companyService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PublishingCompanyResponseDTO save(PublishingCompanyRequestDTO publishingCompanyRequestDTO) {
        return convertToDTO(companyService.save(convertToEntity(publishingCompanyRequestDTO)));
    }

    @Override
    public List<PublishingCompanyResponseDTO> getPublishers() {
        List<PublishingCompanyResponseDTO> publishersList = new ArrayList<>();

        for (PublishingCompany publishingCompany : companyService.getPublishers()) {
            publishersList.add(convertToDTO(publishingCompany));
        }

        return publishersList;
    }

    @Override
    public PublishingCompanyResponseDTO findById(Integer id) {
        return convertToDTO(companyService.findById(id));
    }

    @Override
    public void deleteById(Integer id) {
        companyService.deleteById(id);
    }

    private PublishingCompany convertToEntity(PublishingCompanyRequestDTO publishingCompanyRequestDTO) {
        return modelMapper.map(publishingCompanyRequestDTO, PublishingCompany.class);
    }

    private PublishingCompanyResponseDTO convertToDTO(PublishingCompany publishingCompany) {
        return modelMapper.map(publishingCompany, PublishingCompanyResponseDTO.class);
    }
}
