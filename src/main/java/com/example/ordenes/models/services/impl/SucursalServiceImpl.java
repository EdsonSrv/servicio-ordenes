package com.example.ordenes.models.services.impl;

// import java.math.BigDecimal;
// import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ordenes.models.entitys.Orden;
import com.example.ordenes.models.entitys.Producto;
import com.example.ordenes.models.entitys.Sucursal;
import com.example.ordenes.models.repository.OrdenRepository;
import com.example.ordenes.models.repository.ProductoRepository;
import com.example.ordenes.models.repository.SucursalRepository;
import com.example.ordenes.models.services.ISucursalService;

@Service
public class SucursalServiceImpl implements ISucursalService {

    @Autowired
    private SucursalRepository repository;

    @Autowired
    private OrdenRepository ordenRepository;

    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public Sucursal save(Sucursal sucursal) {
        List<Orden> ordenes = new ArrayList<>();
        for(Orden o: ordenes){
            Double total = 0.0;
            for(Producto producto: o.getProductos()){
                producto.setOrden(o);
                total += producto.getPrecio();
                productoRepository.save(producto);
            }
            Date date = new Date(System.currentTimeMillis());
            // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM--dd");
            o.setFecha(date);
            o.setTotal(total);
            ordenRepository.save(o);
        }
        return repository.save(sucursal);
    }

    @Override
    public List<Sucursal> findAll() {
        return (List<Sucursal>) repository.findAll();
    }
    
}
