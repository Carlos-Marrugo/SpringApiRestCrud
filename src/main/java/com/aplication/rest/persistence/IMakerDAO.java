package com.aplication.rest.persistence;

import java.util.List;

import com.aplication.rest.entities.Maker;

public interface IMakerDAO {

    List<Maker> findAll();

    Maker findByid(Long id);

    void save(Maker maker); //saving maker

    void deleteByid(Long id); //For deleting maker
}
