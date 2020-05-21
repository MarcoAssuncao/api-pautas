package com.pautas.apipautas.votacao.domain.business.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pautas.apipautas.infraestrutura.ObjectValidator;
import com.pautas.apipautas.votacao.domain.VotoIRepository;
import com.pautas.apipautas.votacao.domain.vo.InVotoVO;

@Component
public class VotoPautaValidator implements ObjectValidator<String, InVotoVO> {

	private VotoIRepository repository;
	
	@Autowired
	public VotoPautaValidator(VotoIRepository repository) {
		this.repository = repository;
	}

	@Override
	public String isValid(InVotoVO in ) {
		boolean associadoVotou = repository.existsVotoByAssociadoIdAndPautaId(in.getCodigoAssociado(), in.getCodigoAssociado());
		if(associadoVotou) {
			return "Associado já realizou o voto para está pauta vigente!";
		}
		return null;
	}
}
