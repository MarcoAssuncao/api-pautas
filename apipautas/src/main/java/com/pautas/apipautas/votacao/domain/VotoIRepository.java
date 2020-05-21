package com.pautas.apipautas.votacao.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pautas.apipautas.votacao.domain.entity.Voto;

@Repository
public interface VotoIRepository extends JpaRepository<Voto, Integer>{

}
