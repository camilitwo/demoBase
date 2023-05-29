package com.udp.demobase.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String mail;
    private String rut;
    private char status;
}
