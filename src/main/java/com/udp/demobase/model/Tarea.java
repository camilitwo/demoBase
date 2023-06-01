package com.udp.demobase.model;

import jakarta.persistence.*;

@Entity
@Table(name = "taskcrud")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column
    private String Titulo;
    @Column
    private String Descripcion;

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        this.Id = id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
}
