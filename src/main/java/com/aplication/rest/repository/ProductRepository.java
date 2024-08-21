package com.aplication.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aplication.rest.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
