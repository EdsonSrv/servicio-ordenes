package com.example.ordenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ordenes.models.entitys.Orden;

public interface OrdenRepository extends CrudRepository<Orden, Integer> {
    
}
