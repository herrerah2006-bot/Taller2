package com.clinica.gestion_clinica;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadController {

    private final EspecialidadRepository repository;

    public EspecialidadController(EspecialidadRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Especialidad> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Especialidad guardar(@RequestBody Especialidad e) {
        return repository.save(e);
    }
}
