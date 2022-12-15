package com.healthclinical.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Pessoa {
    private int codigo;
    private String nome;
    private String email;
    private int telefone;
    private int cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}
