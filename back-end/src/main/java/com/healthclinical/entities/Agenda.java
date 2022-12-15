package com.healthclinical.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agenda {
    private int codigo;
    private Date data;
    private int horario;
    private String nome;
    private String email;
    private int telefone;
    private int codigoMedico;

    public void listarAgendamentosFuncionario(){}

    public void listarAgendamentoCliente(){}
}
