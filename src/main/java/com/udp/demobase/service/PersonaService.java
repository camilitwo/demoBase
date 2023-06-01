package com.udp.demobase.service;

import com.udp.demobase.dto.PersonaDTO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface PersonaService {
    List<PersonaDTO> getAllPersonas();

    void createPersona(PersonaDTO personaDTO);

    void updatePersona(PersonaDTO personaDTO);

    void deletePersona(PersonaDTO personaDTO);

    PersonaDTO getPersonaByMail(String mail);

    PersonaDTO getPersonaByRut(String rut);

    List<PersonaDTO> getPersonasByFilter(String filtro) throws Exception;
}
