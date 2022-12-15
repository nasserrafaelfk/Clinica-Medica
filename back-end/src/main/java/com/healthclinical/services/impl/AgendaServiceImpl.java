package com.healthclinical.services.impl;

import com.healthclinical.entities.Consulta;
import com.healthclinical.entities.Funcionario;
import com.healthclinical.entities.Paciente;
import com.healthclinical.repositories.ConsultaRepository;
import com.healthclinical.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AgendaServiceImpl implements AgendaService {

    @Autowired
    ConsultaRepository consultaRepository;

    @Override
    public List<Consulta> getAllAgendamentosFuncionario(Funcionario f){
        List<Consulta> consultas = new ArrayList<>();
        //consultaRepository.findAll().forEach(consultas::add);
        return consultas;
    }
    @Override
    public List<Consulta> getAllAgendamentosPaciente(Paciente p){
        List<Consulta> consultas = new ArrayList<>();
        //consultaRepository.findAll().forEach(consultas::add);
        return consultas;
    }
}
