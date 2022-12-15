package com.healthclinical.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import com.healthclinical.entities.Agenda;
import java.util.List;

public interface AgendaRepository extends CrudRepository<Agenda, Long> {
    /*@Query("FROM Filme WHERE nomeGenero = :nomeGenero")
    List<Paciente> getFilmesByGenero(@Param("nomeGenero") String nomeGenero);*/
}

