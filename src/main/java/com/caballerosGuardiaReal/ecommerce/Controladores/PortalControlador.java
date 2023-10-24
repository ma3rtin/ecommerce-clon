package com.caballerosGuardiaReal.ecommerce.Controladores;

import com.caballerosGuardiaReal.ecommerce.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping("/registrar")
    public String regristar(){
        
        return "formulario.html";
        
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombreCompleto, @RequestParam String clave,@RequestParam String email,@RequestParam String direccion,@RequestParam Integer codigoPostal, ModelMap modelo){
        
        //Falta try catch
        usuarioServicio.crearUsuario(nombreCompleto, clave, email, direccion, codigoPostal);
        
        return "inicio.html";
    }
}
