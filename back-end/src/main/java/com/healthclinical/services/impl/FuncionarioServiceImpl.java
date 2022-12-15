package com.healthclinical.services.impl;

import com.healthclinical.entities.Funcionario;
import com.healthclinical.entities.Medico;
import com.healthclinical.entities.Paciente;
import com.healthclinical.repositories.FuncionarioRepository;
import com.healthclinical.repositories.MedicoRepository;
import com.healthclinical.repositories.PacienteRepository;
import com.healthclinical.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;
    @Autowired
    MedicoRepository medicoRepository;
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public Funcionario cadastroFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Medico cadastroMedico(Medico medico){
        return medicoRepository.save(medico);
    }

    @Override
    public Paciente cadastroPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    @Override
    public List<Funcionario> getAllFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarioRepository.findAll().forEach(funcionarios::add);
        return funcionarios;
    }

    @Override
    public List<Paciente> getAllPacientes(){
        List<Paciente> pacientes = new ArrayList<>();
        pacienteRepository.findAll().forEach(pacientes::add);
        return pacientes;
    }
}
