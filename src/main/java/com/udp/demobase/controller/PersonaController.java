package com.udp.demobase.controller;

import com.udp.demobase.dto.PersonaDTO;
import com.udp.demobase.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<PersonaDTO>> getPersonas() {
        return ResponseEntity.ok(personaService.getAllPersonas());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createPersona(
            @RequestBody PersonaDTO personaDTO
    ) {
        log.info("personaDTO: {}", personaDTO);
        personaService.createPersona(personaDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePersona(
            @RequestBody PersonaDTO personaDTO
    ) {
        log.info("personaDTO: {}", personaDTO);
        personaService.updatePersona(personaDTO);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePersona(
            @RequestBody PersonaDTO personaDTO
    ) {
        log.info("personaDTO: {}", personaDTO);
        personaService.deletePersona(personaDTO);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "{email}", method = RequestMethod.GET)
    public ResponseEntity<PersonaDTO> getPersonasByEmail(
            @PathVariable(name = "email") String mail
    ) {
        return ResponseEntity.ok(personaService.getPersonaByMail(mail));
    }

    @RequestMapping(value = "find-by-rut/{rut}", method = RequestMethod.GET)
    public ResponseEntity<PersonaDTO> getPersonasByRut(
            @PathVariable(name = "rut") String rut
    ) {
        return ResponseEntity.ok(personaService.getPersonaByRut(rut));
    }

    @RequestMapping(value = "find-by-filter", method = RequestMethod.GET)
    public ResponseEntity<List<PersonaDTO>> getPersonasByFilter(
            @RequestParam(name = "filter", required = false) String filtro
    ) throws Exception {
        return ResponseEntity.ok(personaService.getPersonasByFilter(filtro));
    }


    /*
    @RequestMapping(value = "find-active", method = RequestMethod.GET)
    public ResponseEntity<PersonaDTO> getPersonasByRut() {
        return ResponseEntity.ok(personaService.getAllPersonasActives());
    }*/
}

