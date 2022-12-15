package com.healthclinical.controller;


import com.healthclinical.entities.Funcionario;
import com.healthclinical.entities.Medico;
import com.healthclinical.entities.Paciente;
import com.healthclinical.exceptions.ServiceException;
import com.healthclinical.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastro/funcionario")
    public ResponseEntity<Funcionario> cadastroFuncionario(@RequestBody Funcionario funcionario){
        try  {
            var funcionario_ = funcionarioService.cadastroFuncionario(funcionario);
            return new ResponseEntity<>(funcionario_, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }

    @PostMapping("/cadastro/medico")
    public ResponseEntity<Medico> cadastroMedico(@RequestBody Medico medico){
        try  {
            var funcionario_ = funcionarioService.cadastroFuncionario(medico);
            return new ResponseEntity<>(funcionario_, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }

    @PostMapping("/cadastro/paciente")
    public ResponseEntity<Paciente> cadastroPaciente(@RequestBody Paciente paciente){
        try  {
            var funcionario_ = funcionarioService.cadastroFuncionario(paciente);
            return new ResponseEntity<>(funcionario_, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }

    @GetMapping
    public List<Funcionario> getAllFuncionarios(){
        return funcionarioService.getAllFuncionarios();
    }

    @GetMapping("/pacientes")
    public List<Paciente> getAllPacientes(){
        return funcionarioService.getAllPacientes();
    }
}
