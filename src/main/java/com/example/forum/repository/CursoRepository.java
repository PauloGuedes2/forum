package com.example.forum.repository;

import com.example.forum.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, String> {

    Curso findByNome(String nomeCurso);
}
