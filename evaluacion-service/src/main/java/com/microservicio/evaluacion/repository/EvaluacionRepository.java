package com.microservicio.evaluacion.repository;

import com.microservicio.evaluacion.model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
    List<Evaluacion> findByRutEstudiante(String rutEstudiante);
}