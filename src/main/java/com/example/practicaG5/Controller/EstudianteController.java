package com.example.practicaG5.Controller;

import com.example.practicaG5.entity.Estudiante;
import com.example.practicaG5.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> mostrar(){

        return estudianteService.mostrarEstudiante();
    }
    @PostMapping
    public Estudiante insertar(@RequestBody Estudiante estudiante){
        return estudianteService.insertar(estudiante);
    }
    @PutMapping
    public Estudiante actualizar(@RequestBody Estudiante estudiante){
        return estudianteService.actualizar(estudiante);
    }
}
