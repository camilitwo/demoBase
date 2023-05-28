package com.udp.demobase.service;

import com.udp.demobase.dto.PersonaDTO;

import java.util.List;

public interface PersonaService {
    List<PersonaDTO> getAllPersonas();

    void createPersona(PersonaDTO personaDTO);
}
