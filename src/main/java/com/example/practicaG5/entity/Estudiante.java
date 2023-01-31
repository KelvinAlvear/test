package com.example.practicaG5.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Data
@Table(name="estudiantes")
public class Estudiante implements Serializable {
    @Id
    private String est_cedula;
    private String est_nombre;
    private String est_apellido;
    private String est_telefono;
    private String est_direccion;
}
