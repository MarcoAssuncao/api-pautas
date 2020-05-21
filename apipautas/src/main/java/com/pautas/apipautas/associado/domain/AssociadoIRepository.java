package com.pautas.apipautas.associado.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pautas.apipautas.associado.domain.entity.Associado;

@Repository
public interface AssociadoIRepository extends JpaRepository<Associado, Integer> {

}
