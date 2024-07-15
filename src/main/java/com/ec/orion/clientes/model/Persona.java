package com.ec.orion.clientes.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class Persona {

    @Id
    @GeneratedValue    
    private Long id;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String genero;

    @Getter
    @Setter
    private Integer edad;

    @Getter
    @Setter
    private String identificacion;

    @Getter
    @Setter
    private String direccion;

    @Getter
    @Setter
    private String telefono;



}
