package com.healthclinical.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Paciente extends Pessoa{
    private int peso;
    private float altura;
    private String tipoSanguineo;
    private int codigo;

    public void realizarAgendamentoDeConsulta(){}
}
