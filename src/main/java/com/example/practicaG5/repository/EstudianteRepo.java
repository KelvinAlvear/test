package com.example.practicaG5.repository;

import com.example.practicaG5.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepo extends JpaRepository<Estudiante,String> {

    @Query("SELECT e FROM Estudiante e WHERE e.est_cedula= :ced")
    Estudiante findByCedula(@Param("ced")String ced);
}
