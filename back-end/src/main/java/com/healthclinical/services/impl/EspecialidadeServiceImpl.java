package com.healthclinical.services.impl;

import com.healthclinical.entities.Funcionario;
import com.healthclinical.repositories.EspecialidadeRepository;
import com.healthclinical.services.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class EspecialidadeServiceImpl implements EspecialidadeService {

    @Autowired
    EspecialidadeRepository especialidadeRepository;

    public List<String> getAllEspecialidades(){
        List<String> especialidades = new ArrayList<>();
        //especialidadeRepository.findAll().forEach(especialidades::add);
        return especialidades;
    }
}
