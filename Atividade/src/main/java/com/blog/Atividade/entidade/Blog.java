package com.blog.Atividade.entidade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Blog {
    @Id
    private Integer id;
    private String titulo;
    private String tema;
    private Date criacao;
    @ManyToOne
    @JoinColumn(name = "usuario") //
    @JsonIgnore()
    private Usuario usuario;




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
