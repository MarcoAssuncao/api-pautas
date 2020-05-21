package com.pautas.apipautas.votacao.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pautas.apipautas.pauta.domain.entity.SituacaoPautaEnum;
import com.pautas.apipautas.votacao.domain.entity.Voto;

@Repository
public interface VotoIRepository extends JpaRepository<Voto, Integer>{

	boolean existsVotoByAssociadoIdAndPautaId(Integer idAssociado, Integer idPauta);
	
	List<Voto> findByPautaSituacaoPautaAndOrderByPautaIdDesc(SituacaoPautaEnum situacao);
}
