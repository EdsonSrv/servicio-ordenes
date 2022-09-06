package com.example.ordenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ordenes.models.entitys.Sucursal;

public interface SucursalRepository extends CrudRepository<Sucursal, Integer> {
    
}
