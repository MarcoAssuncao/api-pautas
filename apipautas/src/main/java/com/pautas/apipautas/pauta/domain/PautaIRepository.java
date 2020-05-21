package com.pautas.apipautas.pauta.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pautas.apipautas.pauta.domain.entity.Pauta;

@Repository
public interface PautaIRepository extends JpaRepository<Pauta, Integer> {

}
