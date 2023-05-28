package com.udp.demobase.controller;

import com.udp.demobase.dto.PersonaDTO;
import com.udp.demobase.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @RequestMapping(value="", method= RequestMethod.GET)
    public ResponseEntity<List<PersonaDTO>> getPersonas() {
        return ResponseEntity.ok(personaService.getAllPersonas());
    }

    @RequestMapping(value="", method= RequestMethod.POST)
    public ResponseEntity<?> createPersona(
            @RequestBody PersonaDTO personaDTO
    ) {
        log.info("personaDTO: {}", personaDTO);
        personaService.createPersona(personaDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
