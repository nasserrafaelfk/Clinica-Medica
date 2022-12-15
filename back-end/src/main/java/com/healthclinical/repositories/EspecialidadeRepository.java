package com.healthclinical.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import com.healthclinical.entities.Especialidade;
import java.util.List;

public interface EspecialidadeRepository extends CrudRepository<Especialidade, Long> {
    /*@Query("FROM Filme WHERE nomeGenero = :nomeGenero")
    List<Paciente> getFilmesByGenero(@Param("nomeGenero") String nomeGenero);*/
}
