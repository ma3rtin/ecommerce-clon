
package com.caballerosGuardiaReal.ecommerce.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

// OrdenDeCompra
@Entity
@Data
public class Orden {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    
    private String Id;
    private Date fechaPedido;
    //private List<Producto> productos;
    //private Estado pendiente; //pasa a confirmado cuando se emite el ticket

    
}
