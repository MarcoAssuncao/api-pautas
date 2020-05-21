package com.pautas.apipautas.resultadovotacao.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pautas.apipautas.resultadovotacao.domain.vo.OutExibeVotacaoVO;
import com.pautas.apipautas.votacao.domain.entity.OpcaoVotoEnum;
import com.pautas.apipautas.votacao.domain.entity.Voto;
import com.pautas.apipautas.votacao.domain.service.VotoService;

@Service
public class ExibeVotacaoService {
	
	private VotoService votoService;
	
	@Autowired
	public ExibeVotacaoService(VotoService votoService) {
		this.votoService = votoService;
	}

	public OutExibeVotacaoVO exibirResultadoVotacaoPauta() {	
		List<Voto> votosValidos = votoService.findByUltimaPautaEncerrada(1);
		return montarExibirResultadoVotacao(votosValidos);
	}
	
	private long calcularVotos(List<Voto> votosValidos, OpcaoVotoEnum opcao) {
		return votosValidos.stream()
				.filter( x-> x.getOpcaoVoto().equals(opcao)).count();
	}

	private OutExibeVotacaoVO montarExibirResultadoVotacao(List<Voto> votosValidos) {
		long votosSim = calcularVotos(votosValidos,OpcaoVotoEnum.SIM);
		long votosNao = calcularVotos(votosValidos,OpcaoVotoEnum.NAO);
		OutExibeVotacaoVO outVO = new OutExibeVotacaoVO();
		Optional<Voto> votoPauta = votosValidos.stream().findAny();
		if(votoPauta.isPresent()) {
			Voto votoResultado = votoPauta.get();
			outVO.setDescricaoPauta(votoResultado.getPauta().getDescricao());
			outVO.setVotosNao(votosNao);
			outVO.setVotosSim(votosSim);
			outVO.setTotalVotosValidos(outVO.getVotosNao() + outVO.getVotosSim());
		}
		return outVO;
	}
}
