package com.blog.Atividade.repositorio;

import com.blog.Atividade.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
}
