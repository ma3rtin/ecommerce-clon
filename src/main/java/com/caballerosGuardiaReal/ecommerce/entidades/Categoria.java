package com.caballerosGuardiaReal.ecommerce.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Categoria {

    @Id
    @GeneratedValue(generator = "uuid")
   @GenericGenerator(name = "uuid", strategy = "uuid2")
   // @GenericGenerator(name = "uuid", type = org.hibernate.id.uuid.UuidGenerator.class)
    private String Id;

    private String nombre;

}
