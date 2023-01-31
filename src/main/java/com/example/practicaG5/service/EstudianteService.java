package com.example.practicaG5.service;

import com.example.practicaG5.entity.Estudiante;
import com.example.practicaG5.repository.EstudianteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteService {
    @Autowired
    private EstudianteRepo estudianteRepo;

    public List<Estudiante> mostrarEstudiante(){
        return estudianteRepo.findAll();
    }

    public Estudiante insertar(Estudiante estudiante){
        return estudianteRepo.save(estudiante);
    }

    public Estudiante actualizar(Estudiante estudiante){
        return estudianteRepo.save(estudiante);
    }
}
