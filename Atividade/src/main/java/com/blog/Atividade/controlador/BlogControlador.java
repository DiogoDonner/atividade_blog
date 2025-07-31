package com.blog.Atividade.controlador;

import com.blog.Atividade.entidade.Blog;
import com.blog.Atividade.entidade.Usuario;
import com.blog.Atividade.repositorio.BlogRepositorio;
import com.blog.Atividade.repositorio.UsuarioRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/blogs")

public class BlogControlador {
private final UsuarioRepositorio usuarioRepositorio;
private final BlogRepositorio blogRepositorio;


    public BlogControlador(UsuarioRepositorio usuarioRepositorio, BlogRepositorio blogRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.blogRepositorio = blogRepositorio;
    }
    @GetMapping
    List<Blog> listarBlogs(){
        return blogRepositorio.findAll();
    }
    @GetMapping("/usuario/{idUsuario}")
    List<Blog> blogsPorUsuario(@PathVariable Integer idUsuario){
        Usuario usuario = usuarioRepositorio.findById(idUsuario).orElseThrow();
        return usuario.getBlogs();
    }
    @PostMapping("/criar/usuario/{idUsuario}")
    Blog adicionarBlog(@RequestBody Blog blog){

        return null;
    }

}
