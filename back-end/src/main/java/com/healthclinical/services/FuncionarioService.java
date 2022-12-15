package com.healthclinical.services;

import com.healthclinical.entities.Funcionario;
import com.healthclinical.entities.Medico;
import com.healthclinical.entities.Paciente;

import java.util.List;

public interface FuncionarioService {

    Funcionario cadastroFuncionario(Funcionario funcionario);

    Medico cadastroMedico(Medico medico);

    Paciente cadastroPaciente(Paciente paciente);

    List<Funcionario> getAllFuncionarios();

    List<Paciente> getAllPacientes();

}
