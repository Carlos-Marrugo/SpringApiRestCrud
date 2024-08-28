package com.aplication.rest.persistence;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.aplication.rest.entities.Product;

public interface IProductDAO {

    List<Product> findAll();

    Optional<Product> findAll(Long id);

    //Query methods
    List<Product> findProductsByPriceBetween(BigDecimal minPrecio, BigDecimal maxPrecio);

    void saveProduct(Product product);

    void deleteByid(Long id);
}
