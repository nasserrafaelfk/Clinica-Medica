package com.healthclinical.services.impl;

import com.healthclinical.entities.Endereco;
import com.healthclinical.entities.Funcionario;
import com.healthclinical.repositories.EnderecoRepository;
import com.healthclinical.services.BaseDeEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BaseDeEnderecoServiceImpl implements BaseDeEnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public List<Endereco> getAllEnderecos(){
        List<Endereco> enderecos = new ArrayList<>();
        enderecoRepository.findAll().forEach(enderecos::add);
        return enderecos;
    }
}
