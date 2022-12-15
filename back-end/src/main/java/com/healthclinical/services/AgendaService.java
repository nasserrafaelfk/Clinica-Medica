package com.healthclinical.services;

import com.healthclinical.entities.Consulta;
import com.healthclinical.entities.Funcionario;
import com.healthclinical.entities.Paciente;

import java.util.List;

public interface AgendaService {
    List<Consulta> getAllAgendamentosFuncionario(Funcionario f);
    List<Consulta> getAllAgendamentosPaciente(Paciente p);
}
