package com.healthclinical.controller;


import com.healthclinical.entities.Endereco;
import com.healthclinical.services.BaseDeEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/endereco")
public class BaseDeEnderecoController {

    @Autowired
    private BaseDeEnderecoService baseDeEnderecoService;

    @GetMapping
    public List<Endereco> getAllEnderecos(){
        return baseDeEnderecoService.getAllEnderecos();
    }
}
