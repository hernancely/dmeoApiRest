package com.proyectoCiclo3.demo.usuario.controller;


import com.proyectoCiclo3.demo.usuario.dto.UsuarioDto;
import com.proyectoCiclo3.demo.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imc")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public UsuarioDto add(@RequestBody UsuarioDto usuarioDto){
        return usuarioService.add(usuarioDto);
    }
    @GetMapping
    public List<UsuarioDto> getAll() {
        return usuarioService.getAll();
    }
}
