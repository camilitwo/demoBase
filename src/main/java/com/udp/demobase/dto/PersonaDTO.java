package com.udp.demobase.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
}
