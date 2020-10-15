package br.com.bookstore.services;

import br.com.bookstore.entities.PublishingCompany;

import java.util.List;

public interface PublishingCompanyService {

    PublishingCompany save(PublishingCompany publishingCompany);
    List<PublishingCompany> getPublishers();
    PublishingCompany findById(Integer id);
    void deleteById(Integer id);
}
