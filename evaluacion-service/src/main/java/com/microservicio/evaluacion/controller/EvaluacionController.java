package main.java.com.microservicio.evaluacion.controller;

import com.microservicio.evaluacion.model.Evaluacion;
import com.microservicio.evaluacion.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {

    @Autowired
    private EvaluacionRepository repository;

    @PostMapping
    public Evaluacion crearEvaluacion(@RequestBody Evaluacion evaluacion) {
        return repository.save(evaluacion);
    }

    @GetMapping
    public List<Evaluacion> listarEvaluaciones() {
        return repository.findAll();
    }

    @GetMapping("/{rut}")
    public List<Evaluacion> obtenerPorRutEstudiante(@PathVariable String rut) {
        return repository.findByRutEstudiante(rut);
    }
}