package com.clinica.gestion_clinica;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    private final MedicoRepository repository;

    
    public MedicoController(MedicoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Medico> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Medico guardar(@RequestBody Medico medico) {
        return repository.save(medico);
    }

    @PutMapping("/{id}")
    public Medico actualizar(@PathVariable Long id, @RequestBody Medico medico) {
        medico.setId(id);
        return repository.save(medico);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
