package com.healthclinical.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Medico extends Funcionario{
    private String especialidade;
    private String crm;
    private int codigo;
}
