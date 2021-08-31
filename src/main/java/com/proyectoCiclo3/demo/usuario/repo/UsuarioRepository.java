package com.proyectoCiclo3.demo.usuario.repo;

import com.proyectoCiclo3.demo.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
