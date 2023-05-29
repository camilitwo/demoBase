package com.udp.demobase.repository;

import com.udp.demobase.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    Persona findByNombre(String nombre);

    Persona findByMail(String mail);

    Persona findByRut(String rut);

    Persona findByStatus(char status);
}
