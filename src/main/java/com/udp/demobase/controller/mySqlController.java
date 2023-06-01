package com.udp.demobase.controller;

import com.udp.demobase.model.Tarea;
import com.udp.demobase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class mySqlController {

    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/tasks")
    public List<Tarea> getTasks(){
        return todoRepository.findAll();
    }
}
