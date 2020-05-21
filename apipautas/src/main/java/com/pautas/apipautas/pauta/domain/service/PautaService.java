package com.pautas.apipautas.pauta.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pautas.apipautas.pauta.domain.PautaIRepository;
import com.pautas.apipautas.pauta.domain.business.component.PautaAdapter;
import com.pautas.apipautas.pauta.domain.entity.Pauta;
import com.pautas.apipautas.pauta.domain.vo.InPautaVo;
import com.pautas.apipautas.pauta.domain.vo.OutPautaVO;

@Service
public class PautaService {

	private PautaIRepository repository;
	private PautaAdapter pautaAdapter;
	
	@Autowired
	public PautaService(PautaIRepository repository,PautaAdapter pautaAdapter) {
		this.repository = repository;
		this.pautaAdapter = pautaAdapter;
	}

	public OutPautaVO save(InPautaVo pautaVo) {
		Pauta pautaConvert = pautaAdapter.convertToEntity(pautaVo);
		Pauta pautaSaved = repository.save(pautaConvert);
		return pautaAdapter.convertToValueObject(pautaSaved);
	}
	
	public Pauta abrirPauta(Pauta pauta) {
		//TODO
		return repository.saveAndFlush(pauta);
	}
	
	public Pauta encerrarPauta(Pauta pauta) {
		// TODO
		return repository.saveAndFlush(pauta);
	}
	public Pauta findById(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
