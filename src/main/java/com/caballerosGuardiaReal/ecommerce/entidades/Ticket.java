
package com.caballerosGuardiaReal.ecommerce.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Ticket {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    
    private String Id;
    private Date fechaEntrega;
    private Orden ordenDeCompra;
    private Double precioFinal;
    //private Modo formaDePago; //que modo sea un enum de forma de pagos
    
}
