package com.blog.Atividade.entidade;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private LocalDate registro;
    private Date nascimento;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Blog> blogs;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegistro(LocalDate data) {
        return registro;
    }

    public void setRegistro(LocalDate registro) {
        this.registro = registro;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
