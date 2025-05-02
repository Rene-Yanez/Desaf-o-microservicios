package com.microservicio.estudiante.controller;

import com.microservicio.estudiante.model.Estudiante;
import com.microservicio.estudiante.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    // POST /estudiantes
    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return repository.save(estudiante);
    }

    // GET /estudiantes
    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return repository.findAll();
    }

    // GET /estudiantes/{rut}
    @GetMapping("/{rut}")
    public Optional<Estudiante> obtenerEstudiantePorRut(@PathVariable String rut) {
        return repository.findById(rut);
    }
}