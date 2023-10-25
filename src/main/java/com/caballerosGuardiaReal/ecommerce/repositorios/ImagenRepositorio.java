
package com.caballerosGuardiaReal.ecommerce.repositorios;

import com.caballerosGuardiaReal.ecommerce.entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matias Insaurralde
 */
@Repository
public interface ImagenRepositorio extends  JpaRepository<Imagen, String>{
    
}
