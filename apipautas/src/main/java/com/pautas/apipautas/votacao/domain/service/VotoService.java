package com.pautas.apipautas.votacao.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.pautas.apipautas.pauta.domain.business.workflow.PautaNotification;
import com.pautas.apipautas.pauta.domain.entity.SituacaoPautaEnum;
import com.pautas.apipautas.votacao.domain.VotoIRepository;
import com.pautas.apipautas.votacao.domain.business.component.VotoAdapter;
import com.pautas.apipautas.votacao.domain.business.workflow.VotoPautaValidator;
import com.pautas.apipautas.votacao.domain.entity.Voto;
import com.pautas.apipautas.votacao.domain.vo.InVotoVO;
import com.pautas.apipautas.votacao.domain.vo.OutVotoVO;

@Service
public class VotoService {

	private VotoIRepository repository;
	private VotoAdapter votoAdapter;
	private VotoPautaValidator validator;
	private PautaNotification notificacao;
	
	@Autowired
	public VotoService(VotoIRepository repository, VotoAdapter votoAdapter,
			VotoPautaValidator validator, PautaNotification notificacao) {
		this.repository = repository;
		this.votoAdapter = votoAdapter;
		this.validator = validator;
		this.notificacao = notificacao;
	}
	
	@Transactional
	public OutVotoVO save(InVotoVO votoVO) {
		
		String message = validator.isValid(votoVO);
		OutVotoVO vo = new OutVotoVO();
		
		if(!StringUtils.isEmpty(message)) {
			vo.setMessageErro(message);
			return vo;
		}
		
		Voto votoConvert = votoAdapter.convertToEntity(votoVO);
		
		message = notificacao.notificarEncerramentoVotacao(votoVO.getCodigoPauta());
		
		if(!StringUtils.isEmpty(message)) {
			vo.setMessageErro(message);
			return vo;
		}
		Voto votoSaved  = repository.save(votoConvert);
		return votoAdapter.convertToValueObject(votoSaved);
	}
	
	public List<Voto> findByUltimaPautaEncerrada() {
		return repository.findByPautaSituacaoPautaAndOrderByPautaIdDesc(SituacaoPautaEnum.ENCERRADA);
	}
}
