package com.udp.demobase.repository;

import com.udp.demobase.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Tarea, Long> {
}
