package com.proyectoCiclo3.demo.usuario.dto;

import lombok.Data;

@Data
public class UsuarioDto {


    private int usuarioId;
    private String usuarioNombre;
    private String usuarioApellido;
    private int usuarioEdad;
    private Double usuarioTalla;
    private Double usuarioPeso;
}
