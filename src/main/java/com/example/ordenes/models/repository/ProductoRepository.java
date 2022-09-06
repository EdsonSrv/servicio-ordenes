package com.example.ordenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ordenes.models.entitys.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    
}
