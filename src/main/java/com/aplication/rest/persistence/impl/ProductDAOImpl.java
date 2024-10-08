package com.aplication.rest.persistence.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplication.rest.entities.Product;
import com.aplication.rest.persistence.IProductDAO;
import com.aplication.rest.repository.ProductRepository;

@Component
public class ProductDAOImpl implements IProductDAO {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findAll(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findProductsByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductsByPriceBetween(maxPrice, minPrice);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteByid(Long id) {
        productRepository.deleteById(id);
    }

}
