package com.aplication.rest.service;

import java.util.List;
import java.util.Optional;

import com.aplication.rest.entities.Maker;

public interface IMakerService {
    List<Maker> findAll();

    Optional<Maker> findByid(Long id);

    void save(Maker maker); //saving maker

    void deleteByid(Long id); //For deleting maker
}
