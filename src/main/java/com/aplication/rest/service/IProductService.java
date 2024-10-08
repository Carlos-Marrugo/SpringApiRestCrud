package com.aplication.rest.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.aplication.rest.entities.Product;

public interface IProductService {
    List<Product> findById();

    Optional<Product> findById(Long id);

    //Query methods
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    void saveProduct(Product product);

    void deleteByid(Long id);
}
