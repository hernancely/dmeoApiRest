package com.proyectoCiclo3.demo.usuario.service;

import com.proyectoCiclo3.demo.usuario.dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {

    UsuarioDto add(UsuarioDto usuarioDto);
    List<UsuarioDto> getAll();
    UsuarioDto update(int id, UsuarioDto usuarioDto);
    void delete(int id);
}
