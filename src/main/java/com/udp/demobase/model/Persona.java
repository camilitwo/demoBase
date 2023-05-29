package com.udp.demobase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
//crear modelo persona
@Data
@Entity(name = "PERSONA")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String mail;
    private String rut;
    private char status;//0 - NO Activo, 1 ACTIVO
}
