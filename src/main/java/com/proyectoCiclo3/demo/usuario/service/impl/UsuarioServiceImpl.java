package com.proyectoCiclo3.demo.usuario.service.impl;

import com.proyectoCiclo3.demo.usuario.component.UsuarioConverter;
import com.proyectoCiclo3.demo.usuario.dto.UsuarioDto;
import com.proyectoCiclo3.demo.usuario.repo.UsuarioRepository;
import com.proyectoCiclo3.demo.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioConverter usuarioConverter;

    @Override
    public UsuarioDto add(UsuarioDto usuarioDto) {
        var usuario = usuarioConverter.dtoToModel(usuarioDto);
        return usuarioConverter.modelToDto(usuarioRepository.save(usuario));
    }

    @Override
    public List<UsuarioDto> getAll() {
        var usuarios=usuarioRepository.findAll();
        return usuarioConverter.listModeltoDto(usuarios);
    }

    @Override
    public UsuarioDto update(int id, UsuarioDto usuarioDto) {
        return null;
    }

    @Override
    public void delete(int id) {

    }


}
