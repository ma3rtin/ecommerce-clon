
package com.caballerosGuardiaReal.ecommerce.servicios;

import com.caballerosGuardiaReal.ecommerce.entidades.Imagen;
import com.caballerosGuardiaReal.ecommerce.repositorios.ImagenRepositorio;
import java.io.IOException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Matias Insaurralde
 */

@Service
public class ImagenServicio {
      @Autowired
    private ImagenRepositorio imagenRepositorio;

    public Imagen guardar(MultipartFile archivo) throws IOException {

        if (archivo != null) {

                Imagen imagen = new Imagen();

                imagen.setMime(archivo.getContentType());

                imagen.setNombre(archivo.getName());

                imagen.setContenido(archivo.getBytes());

                return imagenRepositorio.save(imagen);
        }
        return null;
            }

    public Imagen actualizar(MultipartFile archivo, String idImagen) throws IOException{
    
        if (archivo != null) {

           
                Imagen imagen = new Imagen();

                if(idImagen!=null){
                    
                    Optional <Imagen> respuesta = imagenRepositorio.findById(idImagen);
                    
                    if(respuesta.isPresent()){
                        
                        imagen = respuesta.get();
                    
                    }
                
                }
                
                imagen.setMime(archivo.getContentType());

                imagen.setNombre(archivo.getName());

                imagen.setContenido(archivo.getBytes());

                return imagenRepositorio.save(imagen);

          
        }

        return null;
        
    }
}
