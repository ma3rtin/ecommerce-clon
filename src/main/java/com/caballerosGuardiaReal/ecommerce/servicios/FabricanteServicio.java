package com.caballerosGuardiaReal.ecommerce.servicios;

import com.caballerosGuardiaReal.ecommerce.entidades.Fabricante;
import com.caballerosGuardiaReal.ecommerce.repositorios.FabricanteRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FabricanteServicio {

    @Autowired
    //ver lanzar throw
    private FabricanteRepositorio fabricanteRepositorio;

    @Transactional
    public Fabricante crearFabricante(String nombre) {

        Fabricante fabricante = new Fabricante();

        //validarNombre repetido
        fabricante.setNombre(nombre.toLowerCase());

        return fabricanteRepositorio.save(fabricante);
    }

    @Transactional
    ///validar
    //lanzar throw
    public Fabricante actualizarFabricante(String id, String nombre) {

        Optional<Fabricante> respuesta = fabricanteRepositorio.findById(id);
        Fabricante fabricante = null;

        if (respuesta.isPresent()) {
            fabricante = respuesta.get();
            fabricante.setNombre(nombre);
            return fabricanteRepositorio.save(fabricante);
        }

        return fabricante;

    }

    public Fabricante getOne(String id) {
        
        return fabricanteRepositorio.findById(id).get();
        
    }

    public List<Fabricante> ListarFabricantes(){
    
        return fabricanteRepositorio.findAll();
        
    }
    
    //validar
    
}
