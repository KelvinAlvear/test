package com.example.practicaG5.Controller;

import com.example.practicaG5.entity.Estudiante;
import com.example.practicaG5.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EstudianteController1 {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/")
    public String  mostrar(Model model){
        List<Estudiante> estudiantes = estudianteService.mostrarEstudiante();
        model.addAttribute("estudiantes",estudiantes);
        return "index";
    }
    @GetMapping("/nuevo-estudiante")
    public String nuevo(Estudiante estudiante){
        return "agregar";
    }
}
