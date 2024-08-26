package com.aplication.rest.service.Impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.rest.entities.Product;
import com.aplication.rest.persistence.IProductDAO;

@Service
public class ProductServiceImpl implements IProductDAO {

    //Modifications
    @Autowired
    IProductDAO productDAO; //Injection

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Optional<Product> findAll(Long id) {
        return productDAO.findAll(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDAO.findByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }

    @Override
    public void deleteByid(Long id) {
        productDAO.deleteByid(id);
    }

}
