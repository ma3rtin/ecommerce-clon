package com.caballerosGuardiaReal.ecommerce.entidades;

import com.caballerosGuardiaReal.ecommerce.enumeraciones.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Data
public class Usuario {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    
    private String nombreCompleto;
    private String clave;
    private String email;
    private String direccion;
    private Integer codigoPostal;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    
    
    /*
    @OneToOne
    private Imagen imagen;
    
    @OneToMany
    private Ticket tickets;
    
    @OneToOne
    private Orden orden;
    */
    
}
