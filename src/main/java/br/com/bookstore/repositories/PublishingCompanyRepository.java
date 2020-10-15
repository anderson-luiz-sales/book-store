package br.com.bookstore.repositories;

import br.com.bookstore.entities.PublishingCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishingCompanyRepository extends JpaRepository<PublishingCompany, Integer> {

    PublishingCompany findByid(Integer id);
}
