
package com.caballerosGuardiaReal.ecommerce.controladores;

import java.net.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
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


@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
    
//       @Autowired
//   private UsuarioServicio usuarioServicio;
//    
//    @GetMapping("/perfil/{id}")
//   public ResponseEntity<byte[]> ImagenUsuario(@PathVariable String id){
//       Usuario = UsuarioServicio.getOne(id);
//        
//       byte[] imagen = Usuario.getImagen().getContenido();
//        
//       HttpHeaders headers = new HttpHeaders();
//       headers.setContentType(MediaType.IMAGE_JPEG);
//        
//       return new ResponseEntity<>(imagen,headers,HttpStatus.OK);
//    }
//    
    
    
    
}
