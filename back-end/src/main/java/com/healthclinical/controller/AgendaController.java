package com.healthclinical.controller;

import com.healthclinical.entities.Consulta;
import com.healthclinical.entities.Funcionario;
import com.healthclinical.entities.Paciente;
import com.healthclinical.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping("/funcionario/{codigo}")
    public List<Consulta> getAllAgendamentosFuncionario(@PathVariable ("codigo")String codigo,Funcionario f){
        return agendaService.getAllAgendamentosFuncionario(f);
    }
    @GetMapping("/paciente/{codigo}")
    public List<Consulta> getAllAgendamentosPaciente(@PathVariable ("codigo")String codigo,Paciente p){
        return agendaService.getAllAgendamentosPaciente(p);
    }

}
