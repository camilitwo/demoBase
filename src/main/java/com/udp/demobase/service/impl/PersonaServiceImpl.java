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
        List<Persona> personList = personaRepository.findAll();

        return personList.stream().map(persona -> PersonaDTO.builder()
                .id(persona.getId())
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .direccion(persona.getDireccion())
                .mail(persona.getMail())
                .rut(persona.getRut())
                .telefono(persona.getTelefono())
                .status(persona.getStatus())
                .build()).collect(Collectors.toList());
    }

    @Override
    public void createPersona(PersonaDTO personaDTO) {
        Persona persona = new Persona();
        BeanUtils.copyProperties(personaDTO, persona);
        persona.setStatus('1');
        personaRepository.save(persona);
    }

    @Override
    public void updatePersona(PersonaDTO personaDTO) {
        Persona persona = new Persona();
        BeanUtils.copyProperties(personaDTO, persona);
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(PersonaDTO personaDTO) {
        Persona persona = new Persona();
        BeanUtils.copyProperties(personaDTO, persona);
        personaRepository.delete(persona);
    }

    @Override
    public PersonaDTO getPersonaByMail(String mail) {
        Persona persona = personaRepository.findByMail(mail);
        PersonaDTO personaDTO = new PersonaDTO();
        BeanUtils.copyProperties(persona,personaDTO);

        return personaDTO;
    }

    @Override
    public PersonaDTO getPersonaByRut(String rut) {
        Persona persona = personaRepository.findByRut(rut);
        PersonaDTO personaDTO = new PersonaDTO();
        BeanUtils.copyProperties(persona, personaDTO);

        return personaDTO;
    }
}

