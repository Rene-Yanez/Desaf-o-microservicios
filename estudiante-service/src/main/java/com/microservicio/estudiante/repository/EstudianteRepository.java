package com.microservicio.estudiante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicio.estudiante.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, String>{
}