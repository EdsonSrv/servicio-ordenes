package com.example.ordenes.models.services;

import java.util.List;

import com.example.ordenes.models.entitys.Sucursal;

public interface ISucursalService {
    Sucursal save(Sucursal sucursal);
    List<Sucursal> findAll();
}
