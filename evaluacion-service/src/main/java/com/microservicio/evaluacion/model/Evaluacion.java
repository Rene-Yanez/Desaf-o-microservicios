package main.java.com.microservicio.evaluacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluaciones")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rutEstudiante;
    private String asignatura;
    private Integer nota;

    public Evaluacion() {
    }

    public Evaluacion(String rutEstudiante, String asignatura, Integer nota) {
        this.rutEstudiante = rutEstudiante;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getRutEstudiante() {
        return rutEstudiante;
    }

    public void setRutEstudiante(String rutEstudiante) {
        this.rutEstudiante = rutEstudiante;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}