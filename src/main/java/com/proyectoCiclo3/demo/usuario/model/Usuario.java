package com.proyectoCiclo3.demo.usuario.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private int usuarioId;
    private String usuarioNombre;
    private String usuarioApellido;
    private int usuarioEdad;
    private Double usuarioTalla;
    private Double usuarioPeso;

}
