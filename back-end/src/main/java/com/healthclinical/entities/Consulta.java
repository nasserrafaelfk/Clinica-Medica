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

public class Consulta {
    private String especialidade;
    private String nomeMedico;
    private Date data;
    private int horario;
}
