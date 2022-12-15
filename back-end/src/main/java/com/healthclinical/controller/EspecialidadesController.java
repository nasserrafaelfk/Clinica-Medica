package com.healthclinical.controller;

import com.healthclinical.entities.Medico;
import com.healthclinical.services.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadesController {

    @Autowired
    EspecialidadeService especialidadeService;

    @GetMapping("/{codigo}")
    public List<String> getAllEspecialidades(@PathVariable ("codigo") String codigo, Medico medico){
    //todo consertar

        return especialidadeService.getAllEspecialidades();
    }
}
