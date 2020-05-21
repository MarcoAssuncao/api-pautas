package com.pautas.apipautas.votacao.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pautas.apipautas.votacao.domain.VotoIRepository;
import com.pautas.apipautas.votacao.domain.business.VotoAdapter;
import com.pautas.apipautas.votacao.domain.entity.Voto;
import com.pautas.apipautas.votacao.domain.vo.InVotoVO;
import com.pautas.apipautas.votacao.domain.vo.OutVotoVO;

@Service
public class VotoService {

	private VotoIRepository repository;
	private VotoAdapter votoAdapter;
	
	@Autowired
	public VotoService(VotoIRepository repository, VotoAdapter votoAdapter) {
		this.repository = repository;
		this.votoAdapter = votoAdapter;
	}
	
	public OutVotoVO save(InVotoVO votoVO) {
		
		//TODO validar votacao de usuario repetido
		// TODO validar se pauta ja voi encerrada
		Voto votoConvert = votoAdapter.convertToEntity(votoVO);
		Voto votoSaved  = repository.save(votoConvert);
		return votoAdapter.convertToValueObject(votoSaved);
	}
	
	public List<Voto> findByUltimaPautaEncerrada(Integer idPauta) {
		return repository.findAll();
	}
}
