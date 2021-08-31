package com.proyectoCiclo3.demo.usuario.component;

import com.proyectoCiclo3.demo.usuario.dto.UsuarioDto;
import com.proyectoCiclo3.demo.usuario.model.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioConverter {

    public UsuarioDto modelToDto(Usuario usuario){
        var usuarioDto= new UsuarioDto();
        BeanUtils.copyProperties(usuario,usuarioDto);
        return usuarioDto;
    }
    public Usuario dtoToModel(UsuarioDto usuarioDto){
        var usuario= new Usuario();
        BeanUtils.copyProperties(usuarioDto,usuario);
        return usuario;
    }

    public List<UsuarioDto> listModeltoDto(List<Usuario>usuarios){
        List<UsuarioDto> usuarioDtos= new ArrayList<>();
        for (Usuario usuario: usuarios) {
            usuarioDtos.add(modelToDto(usuario));
        }
        return usuarioDtos;
    }
}
