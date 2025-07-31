package com.blog.Atividade.repositorio;

import com.blog.Atividade.entidade.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepositorio extends JpaRepository<Blog, Integer> {
}
