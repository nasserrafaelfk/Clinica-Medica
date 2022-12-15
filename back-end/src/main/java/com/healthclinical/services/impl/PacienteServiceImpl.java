package com.healthclinical.services.impl;

import com.healthclinical.entities.Consulta;
import com.healthclinical.repositories.ConsultaRepository;
import com.healthclinical.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public Consulta realizarAgendamentoDeConsulta(Consulta consulta){return consultaRepository.save(consulta);}

}
