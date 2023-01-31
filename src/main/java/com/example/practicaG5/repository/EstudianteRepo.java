package com.example.practicaG5.repository;

import com.example.practicaG5.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepo extends JpaRepository<Estudiante,String> {
}
