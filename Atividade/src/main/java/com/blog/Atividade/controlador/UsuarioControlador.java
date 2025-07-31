package com.blog.Atividade.controlador;

import com.blog.Atividade.entidade.Usuario;
import org.springframework.web.bind.annotation.*;
import com.blog.Atividade.repositorio.UsuarioRepositorio;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioControlador(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }


    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioRepositorio.findAll();
    }

    @GetMapping("/{idUsuario}")
    public Usuario buscarUsuario(@PathVariable Integer idUsuario){
        return this.usuarioRepositorio.findById(idUsuario).get();
    }

    @PostMapping("/adicionar")
    public Usuario adicionarUsuario(@RequestBody Usuario usuario){
        LocalDate registro = LocalDate.now();
        usuario.setRegistro(registro);
        Usuario user = this.usuarioRepositorio.save(usuario);
        return user;

    }

    @PutMapping("/alterar/{idUsuario}")
    public Usuario alterarUsuario (@RequestBody Usuario usuario, @PathVariable Integer idUsuario){
        Usuario alter = this.usuarioRepositorio.findById(idUsuario).get();
        alter.setUsername(usuario.getUsername());
        alter.setEmail(usuario.getEmail());
        alter.setNascimento(usuario.getNascimento());

        return usuario;
    }

    @DeleteMapping("/deletar/{idUsuario}")
    public Usuario deletarUsuario (@PathVariable Integer idUsuario){
        Usuario del = this.usuarioRepositorio.findById(idUsuario).get();
        this.usuarioRepositorio.deleteById(idUsuario);
        return del;
    }


}
