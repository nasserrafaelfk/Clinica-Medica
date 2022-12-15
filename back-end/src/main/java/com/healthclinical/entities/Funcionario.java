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
public class Funcionario extends Pessoa{
    private Date dataContrato;
    private int salario;
    private int senhaHash;
    private int codigo;

    public void cadastrarFuncionario(){}
    public void cadastrarMedico(){}
    public void cadastrarPaciente(){}
    public void listarFuncionarios(){}
    public void listarPacientes(){}

}
