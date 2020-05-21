package com.pautas.apipautas.associado.domain.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pautas.apipautas.associado.domain.AssociadoIRepository;
import com.pautas.apipautas.associado.domain.business.AssociadoAdapter;
import com.pautas.apipautas.associado.domain.entity.Associado;
import com.pautas.apipautas.associado.domain.vo.InAssociadoVO;
import com.pautas.apipautas.associado.domain.vo.OutAssociadoVO;

@Service
public class AssociadoService {

	private AssociadoIRepository associadoRepostory;
	private AssociadoAdapter associadoAdapter;

	@Autowired
	public AssociadoService(AssociadoIRepository associadoRepostory, AssociadoAdapter associadoAdapter) {
		this.associadoRepostory = associadoRepostory;
		this.associadoAdapter = associadoAdapter;
	}

	public OutAssociadoVO save(InAssociadoVO associadoVO) {
		Associado associadoConvert = this.associadoAdapter.convertToEntity(associadoVO);
		Associado associadoSaved = associadoRepostory.save(associadoConvert);
		return associadoAdapter.convertToValueObject(associadoSaved);
	}

	public Associado findById(Integer id) {
		return associadoRepostory.findById(id).orElse(null);
	}

	public Set<Associado> findAll() {
		return associadoRepostory.findAll().stream().collect(Collectors.toSet());
	}
}
