package com.portfolio.gm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 20 ,message = "Todos los campos son obligatorios")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 20 ,message = "Todos los campos son obligatorios")
    private String apellido;
     
    @Size(min = 1, max = 20 ,message = "Todos los campos son obligatorios")
    private String img;
    
    
}
