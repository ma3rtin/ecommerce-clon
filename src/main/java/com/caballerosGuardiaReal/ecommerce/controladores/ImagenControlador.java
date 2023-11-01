
package com.caballerosGuardiaReal.ecommerce.controladores;

import com.caballerosGuardiaReal.ecommerce.entidades.Usuario;
import com.caballerosGuardiaReal.ecommerce.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Matias Insaurralde
 */

///revisar esto no funca
@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
    
       @Autowired
   private UsuarioServicio usuarioServicio;
    
    @GetMapping("/producto/{id}")
   public ResponseEntity<byte[]> ImagenUsuario(@PathVariable String id){
       Usuario usuario = usuarioServicio.getOne(id);
        
       byte[] imagen = usuario.getImagen().getContenido();
        
       HttpHeaders headers = new HttpHeaders();
       headers.setContentType(MediaType.IMAGE_JPEG);
        
       return new ResponseEntity<>(imagen,headers,HttpStatus.OK);
    }
    
    
    
    
}
