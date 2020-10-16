package br.com.bookstore.services.impl;

import br.com.bookstore.entities.PublishingCompany;
import br.com.bookstore.exceptions.NotFoundException;
import br.com.bookstore.repositories.PublishingCompanyRepository;
import br.com.bookstore.services.PublishingCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishingCompanyServiceImpl implements PublishingCompanyService {

    @Autowired
    private PublishingCompanyRepository companyRepository;

    @Override
    public PublishingCompany save(PublishingCompany publishingCompany) {
        return companyRepository.save(publishingCompany);
    }

    @Override
    public List<PublishingCompany> getPublishers() {
        return companyRepository.findAll();
    }

    @Override
    public PublishingCompany findById(Integer id) {
        if(companyRepository.findByid(id) == null) {
            throw new NotFoundException("");
        }
        return companyRepository.findByid(id);
    }

    @Override
    public void deleteById(Integer id) {
        companyRepository.deleteById(id);
    }
}
