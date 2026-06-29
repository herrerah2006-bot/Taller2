package com.clinica.gestion_clinica;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    private final CitaRepository repository;

    public CitaController(CitaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cita> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cita guardar(@RequestBody Cita cita) {
        return repository.save(cita);
    }
}
