package com.aplication.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aplication.rest.entities.Maker;

@Repository
public interface MakerRepository extends CrudRepository<Maker, Long> {
    
}
