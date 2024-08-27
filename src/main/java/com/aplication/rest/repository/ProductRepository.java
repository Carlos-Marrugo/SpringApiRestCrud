package com.aplication.rest.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplication.rest.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Using jpql
    //@Query("SELECT p FRROM Product p WHERE p.price >= ?1 AND p.price <= ?2")
    //Between operator
    @Query("SELECT p FRROM Product p WHERE p.precio ?1 BETWEEN ?2")
    List<Product> findProductsByPriceInRange(BigDecimal maxPrecio, BigDecimal minP); 

}
