package com.example.ordenes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ordenes.models.entitys.Sucursal;
import com.example.ordenes.models.services.ISucursalService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class OrdenController {

    @Autowired
    private ISucursalService sucursalService;


    @PostMapping("/agregarSucursal")
    public ResponseEntity<?> agregarSucursal(@RequestBody Sucursal sucursal){
        return new ResponseEntity<Sucursal>(sucursalService.save(sucursal), HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {
        return new ResponseEntity<List<Sucursal>>(sucursalService.findAll(),HttpStatus.CREATED);
    }
    
}
