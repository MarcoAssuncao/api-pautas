package com.pautas.apipautas.aberturasessao.domain.service;

import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.pautas.apipautas.aberturasessao.domain.business.AberturaSessaoAdapter;
import com.pautas.apipautas.aberturasessao.domain.vo.InAberturaSessaoVO;
import com.pautas.apipautas.aberturasessao.domain.vo.OutAberturaSessaoVO;
import com.pautas.apipautas.associado.domain.entity.Associado;
import com.pautas.apipautas.associado.domain.service.AssociadoService;
import com.pautas.apipautas.pauta.domain.entity.Pauta;
import com.pautas.apipautas.pauta.domain.entity.SituacaoPautaEnum;
import com.pautas.apipautas.pauta.domain.service.PautaService;

@Service
public class AberturaSessaoService {

	private PautaService pautaService;
	private AssociadoService associadoService;
	private AberturaSessaoAdapter aberturaSessaoAdapter;
	
	@Autowired
	public AberturaSessaoService(PautaService pautaService, AssociadoService associadoService,
			AberturaSessaoAdapter aberturaSessaoAdapter) {
		this.pautaService = pautaService;
		this.associadoService = associadoService;
		this.aberturaSessaoAdapter = aberturaSessaoAdapter;
	}

	public OutAberturaSessaoVO abrirEfecharSessaoVotacao(InAberturaSessaoVO in) {
		
		Pauta pautaSearch = pautaService.findById(in.getCodigoPauta());
		Set<Associado> associadosList = associadoService.findAll();
		if(Objects.nonNull(pautaSearch) 
				&& SituacaoPautaEnum.CRIADA.equals(pautaSearch.getSituacaoPauta())
				&& !CollectionUtils.isEmpty(associadosList)) {
			pautaSearch.setAssociados(associadosList);
			pautaSearch.setSituacaoPauta(SituacaoPautaEnum.ABERTA);
		}
		Pauta pautaSaved = pautaService.abrirPauta(pautaSearch);
		return fecharSessaoVotacao(pautaSaved);
	}
	
	private OutAberturaSessaoVO fecharSessaoVotacao(Pauta pauta) {
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pauta.setSituacaoPauta(SituacaoPautaEnum.ENCERRADA);
		Pauta pautaSaved = pautaService.encerrarPauta(pauta);
		aberturaSessaoAdapter.convertToValueObject(pautaSaved);
		return 	aberturaSessaoAdapter.convertToValueObject(pautaSaved);
	}
}
