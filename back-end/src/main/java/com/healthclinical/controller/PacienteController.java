package com.healthclinical.controller;


import com.healthclinical.entities.Consulta;
import com.healthclinical.exceptions.ServiceException;
import com.healthclinical.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController  {

    @Autowired
    PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Consulta> realizarAgendamentoDeConsulta(@RequestBody Consulta consulta_){
        try  {
            var consulta = pacienteService.realizarAgendamentoDeConsulta(consulta_);
            return new ResponseEntity<>(consulta, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }

}
