package com.pautas.apipautas.pauta.domain.business.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pautas.apipautas.pauta.domain.PautaIRepository;
import com.pautas.apipautas.pauta.domain.entity.SituacaoPautaEnum;

@Component
public class PautaNotification {

	private PautaIRepository repository;

	@Autowired
	public PautaNotification(PautaIRepository repository) {
		this.repository = repository;
	}

	public String notificarEncerramentoVotacao(Integer codigoPauta) {
		boolean pautaEncerrada = repository.existsPautaByIdAndSituacaoPauta(codigoPauta, SituacaoPautaEnum.ENCERRADA);
		if(pautaEncerrada) {
			return "Tempo de Votação Encerrado!";
		}
		return null;
	}
}
