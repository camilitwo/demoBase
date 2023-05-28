package com.udp.demobase.service.impl;

import com.udp.demobase.dto.PersonaDTO;
import com.udp.demobase.model.Persona;
import com.udp.demobase.repository.PersonaRepository;
import com.udp.demobase.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    @Override
    public List<PersonaDTO> getAllPersonas() {
        List<PersonaDTO> listaPersona = null;
        List<Persona> lista = personaRepository.findAll();
        //copy properties from Persona to PersonaDTO
        listaPersona = lista.stream().map(persona -> PersonaDTO.builder()
                .id(persona.getId())
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .direccion(persona.getDireccion())
                .build()).collect(Collectors.toList());

        return listaPersona;
    }

    @Override
    public void createPersona(PersonaDTO personaDTO) {
        Persona persona = new Persona();
        BeanUtils.copyProperties(personaDTO, persona);
        personaRepository.save(persona);
    }
}
